package com.gordon.design.pattern.creational.factorymethod;

/**
 * Created by gordon
 */
public class FEVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
