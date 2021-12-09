package com.test.demo1;

import org.testng.annotations.Test;

public class ExpectedExceptions {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是异常测试");
        throw new RuntimeException();
    }
}
