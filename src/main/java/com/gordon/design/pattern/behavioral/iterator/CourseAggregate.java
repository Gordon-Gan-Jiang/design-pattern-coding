package com.gordon.design.pattern.behavioral.iterator;

/**
 * Created by gordon.
 */
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();



}
