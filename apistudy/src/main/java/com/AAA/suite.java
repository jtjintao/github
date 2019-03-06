package com.AAA;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suite {
    @BeforeSuite
    public void beforesuit(){
        System.out.println("beforesuite");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("aftersuite");
    }
    @BeforeTest
    public  void Beforetest(){

        System.out.println("before test");
    }
    @AfterTest
    public  void Aftertest(){
        System.out.println("after test");
    }
}
