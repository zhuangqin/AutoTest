package com.test.demo1.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

//所有测试套件的配置
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit运行了");
    }
    @AfterSuite
    public void afterSuit() {
        System.out.println("after suit运行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
