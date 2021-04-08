package com.gordon.design.pattern.structural.adapter.classadapter;

/**
 * Created by gordon
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
