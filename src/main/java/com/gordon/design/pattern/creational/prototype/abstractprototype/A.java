package com.gordon.design.pattern.creational.prototype.abstractprototype;

/**
 * Created by Gordon.Gan
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
