package com.gordon.design.pattern.structural.adapter.classadapter;

/**
 * Created by Gordon.Gan
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
