package com.AAA;

import org.testng.annotations.*;

public class Basezhujie {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void Beforemethod(){
        System.out.println("Beforemethod ");
    }
    @AfterMethod
    public void Aftermethod(){
        System.out.println("aftermethod");
    }



    @BeforeClass
    public void Beforeclass(){
        System.out.println("before class");
    }
    @AfterClass
    public void Afterclass(){
        System.out.println("after class");
    }

}
