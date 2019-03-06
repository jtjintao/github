package com.AAA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class dataprovide {


    @Test(dataProvider = "Datas")
    public void test1(String name,int age){
        System.out.println("test1: name="+name+", age="+age);

    }
    @Test(dataProvider= "Datas")
    public void test2(String name ,int age){
        System.out.println("test2: name="+name+", age="+age);
    }

    @DataProvider(name = "Datas")
    public Object[][] xdataprovider(Method method) {

        Object[][] o =null;
        if (method.getName().equals("test1")){
            o = new Object[][]{
                    {"jintao",33},
                    {"zhangying",34}
            };
        }
        else{

            o = new Object[][]{
                    {"xxx",1},
                    {"yyy",2}
            };
        }
        return o;
    }
}
