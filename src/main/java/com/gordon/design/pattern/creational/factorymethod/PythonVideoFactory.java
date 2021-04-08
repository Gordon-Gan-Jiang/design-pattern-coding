package com.gordon.design.pattern.creational.factorymethod;

/**
 * Created by gordon
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
