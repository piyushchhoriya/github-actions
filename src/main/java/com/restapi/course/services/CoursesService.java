package com.restapi.course.services;

import java.util.List;

import com.restapi.course.entities.Course;

public interface CoursesService {

	public List<Course> getAllCourses();

	public Course putCourse(Course course);

	public void updateCourse(Course course);

	public Course getCourse(long long1);

}
