package com.AAA;

import org.testng.annotations.Test;

public class ignoretest {
    @Test
    public void igoretest1(){

        System.out.println("ignore");
    }

    @Test(enabled=false)
    public void igoretest2(){

        System.out.println("ignore2");
    }

}
