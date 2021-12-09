package com.test.demo1.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest(String name,int age){
        System.out.println("name="+name+"; age="+age);
    }
}
