package com.edu.CollegeManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.CollegeManagementSystem.Entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{


	List<Course> findByCourseName(String courseName);

}
