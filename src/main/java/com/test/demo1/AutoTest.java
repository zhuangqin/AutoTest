package com.test.demo1;

import org.testng.annotations.*;

public class AutoTest {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这里测试之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类运行之前的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.print("这是类运行之后的方法");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("测试套件开始");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("测试套件结束");
    }
}
