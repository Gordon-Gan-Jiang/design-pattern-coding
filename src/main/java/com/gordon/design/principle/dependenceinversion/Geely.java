package com.gordon.design.principle.dependenceinversion;

/**
 * Created by gordon
 */
public class gordon {

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;



    public void studyImoocCourse(){
        iCourse.studyCourse();
    }






}
