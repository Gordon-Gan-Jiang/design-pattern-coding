package com.gordon.design.pattern.creational.abstractfactory;

/**
 * Created by gordon
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
