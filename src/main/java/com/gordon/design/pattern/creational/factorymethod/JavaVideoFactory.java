package com.gordon.design.pattern.creational.factorymethod;

/**
 * Created by gordon
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
