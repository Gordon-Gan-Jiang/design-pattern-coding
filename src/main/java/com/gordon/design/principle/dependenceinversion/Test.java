package com.gordon.design.principle.dependenceinversion;

/**
 * Created by gordon
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        gordon gordon = new gordon();
//        gordon.studyJavaCourse();
//        gordon.studyFECourse();
//    }

    //v2
//    public static void main(String[] args) {
//        gordon gordon = new gordon();
//        gordon.studyImoocCourse(new JavaCourse());
//        gordon.studyImoocCourse(new FECourse());
//        gordon.studyImoocCourse(new PythonCourse());
//    }

    //v3
//    public static void main(String[] args) {
//        gordon gordon = new gordon(new JavaCourse());
//        gordon.studyImoocCourse();
//    }
    public static void main(String[] args) {
        gordon gordon = new gordon();
        gordon.setiCourse(new JavaCourse());
        gordon.studyImoocCourse();

        gordon.setiCourse(new FECourse());
        gordon.studyImoocCourse();

    }


}
