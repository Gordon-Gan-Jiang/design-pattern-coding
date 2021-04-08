package com.gordon.design.pattern.creational.factorymethod;

/**
 * Created by gordon
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
