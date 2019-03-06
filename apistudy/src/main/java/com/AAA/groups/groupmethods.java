package com.AAA.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupmethods {
    @Test(groups="server")
    public void test1(){
        System.out.println("server group test1");
    }
    @Test(groups="client")
    public void test2(){
        System.out.println("client group test2");
    }
    @Test(groups="server")
    public void test3(){
        System.out.println("server group test3");
    }
    @Test(groups="client")
    public void test4(){
        System.out.println("client group test4");

    }
    @BeforeGroups("server")
    public void beforeGroupsonserver(){
        System.out.println("before server group ");
    }
    @AfterGroups("server")
    public void aftergroupsonserver(){
        System.out.println("after server groups ");
    }
    @BeforeGroups("client")
    public void beforeGroupsonclient(){
        System.out.println("before clinet group ");
    }
    @AfterGroups("client")
    public void aftergroupsonclient(){
        System.out.println("after client groups ");
    }

}
