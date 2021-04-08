package com.gordon.design.principle.dependenceinversion;

/**
 * Created by gordon
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("gordon在学习FE课程");
    }

}
