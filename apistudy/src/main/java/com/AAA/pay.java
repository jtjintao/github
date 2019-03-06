package com.AAA;

import org.testng.annotations.*;

public class pay {
    @Test
    public void testCase1(){
        System.out.println("这是pay1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是pay2");
    }

    @BeforeMethod
    public void Beforemethod(){
        System.out.println("pay Beforemethod ");
    }
    @AfterMethod
    public void Aftermethod(){
        System.out.println("pay aftermethod");
    }



    @BeforeClass
    public void Beforeclass(){
        System.out.println(" pay before class");
    }
    @AfterClass
    public void Afterclass(){
        System.out.println("pay after class");
    }

}
