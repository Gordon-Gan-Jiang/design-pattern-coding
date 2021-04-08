package com.gordon.design.pattern.creational.simplefactory;

/**
 * Created by gordon
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
