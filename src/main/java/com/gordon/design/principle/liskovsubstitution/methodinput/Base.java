package com.gordon.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * Created by gordon
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
