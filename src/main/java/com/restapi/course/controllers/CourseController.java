package com.restapi.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.course.entities.Course;
import com.restapi.course.services.CoursesService;

@RestController
public class CourseController {
	
	@Autowired
	CoursesService courseService;


	
	 @GetMapping("/courses")
	    public ResponseEntity<List<Course>> getCourses() {
	        try {
	        	System.out.println("Piyush");
	            List<Course> courses = courseService.getAllCourses();
//	            return ResponseEntity.status(HttpStatus.ACCEPTED).body(courses);
	            return new ResponseEntity<>(courses, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	
	@GetMapping("/courses/{courseId}")
	public Course getCourses(@PathVariable String courseId){
		
		return courseService.getCourse(Long.parseLong(courseId));
		
	}
	
	@PostMapping("/courses")
	public Course putCourse(@RequestBody Course course) {
		
		return courseService.putCourse(course);
		
	}
	
	@PutMapping("/courses")
	public void updateCourse(@RequestBody Course course) {
		courseService.updateCourse(course);
	}
	
}
