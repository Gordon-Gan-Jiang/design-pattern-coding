package com.gordon.design.pattern.structural.adapter.objectadapter;


/**
 * Created by Gordon.Gan
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
