package com.wesley.pattern.proxy;

/**
 * @author Created by Wesley on 2016/5/11.
 */
public class TestClass implements TestInterface{

    @Override
    public void method1(String arg){
        System.out.println(" 接口方法实现: Test Class method1");
    }

    public void method2(){
        System.out.println(" 接口方法实现: Test Class method2");
    }

    public void method3(String arg1, Integer arg2){
        System.out.println(" 接口方法实现: Test Class method3");
    }
}
