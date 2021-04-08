package com.gordon.design.principle.dependenceinversion;

/**
 * Created by gordon
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("gordon在学习Java课程");
    }
}
