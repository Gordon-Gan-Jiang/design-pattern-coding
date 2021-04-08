package com.gordon.design.principle.demeter;


/**
 * Created by gordon
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
