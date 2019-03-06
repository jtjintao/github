package com.AAA;

import org.testng.annotations.Test;

public class timeouttest {
    @Test(timeOut = 2000)
    public void test1(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("test1 run");
    }
}
