package com.gordon.design.principle.singleresponsibility;

/**
 * Created by gordon
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
