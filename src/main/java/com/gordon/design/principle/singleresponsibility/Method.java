package com.gordon.design.principle.singleresponsibility;

/**
 * Created by gordon
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "gordon";
        address = "beijing";
    }

    private void updateUserInfo(String userName,String... properties){
        userName = "gordon";
//        address = "beijing";
    }

    private void updateUsername(String userName){
        userName = "gordon";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }


        userName = "gordon";
        address = "beijing";
    }


}
