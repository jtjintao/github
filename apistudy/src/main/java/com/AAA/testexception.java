package com.AAA;

import org.testng.annotations.Test;

public class testexception {

    @Test(enabled = false,expectedExceptions = RuntimeException.class)
    public void runtimeexceptionfailed(){
        System.out.println("失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionsuccess(){
        System.out.println("这时我的异常测试");
        throw new RuntimeException();
    }
}
