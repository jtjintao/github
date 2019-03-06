package com.AAA;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testdepends {

    @Test
    @Parameters({"name","age"})
    public void test(String name,String age){


        System.out.println("name :"+name +" ;age = "+age);
    }

}
