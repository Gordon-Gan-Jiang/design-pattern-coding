package com.gordon.design.principle.dependenceinversion;

/**
 * Created by gordon
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("gordon在学习Python课程");
    }
}
