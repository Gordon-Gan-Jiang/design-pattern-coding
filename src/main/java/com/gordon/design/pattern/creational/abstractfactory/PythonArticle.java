package com.gordon.design.pattern.creational.abstractfactory;

/**
 * Created by gordon
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
