package com.restapi.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.course.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
