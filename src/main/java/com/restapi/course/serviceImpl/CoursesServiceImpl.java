package com.restapi.course.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.course.dao.CourseDao;
import com.restapi.course.entities.Course;
import com.restapi.course.services.CoursesService;

@Service
public class CoursesServiceImpl implements CoursesService{
	
	@Autowired
	CourseDao courseDao;

	@Override
	public List<Course> getAllCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course putCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public void updateCourse(Course course) {
		courseDao.save(course);
		
	}

	@Override
	public Course getCourse(long long1) {
		
		return courseDao.getOne(long1);
	}

}
