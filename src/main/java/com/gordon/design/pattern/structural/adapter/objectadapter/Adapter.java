package com.gordon.design.pattern.structural.adapter.objectadapter;

/**
 * Created by Gordon.Gan
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
