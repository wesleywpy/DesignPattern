package com.wesley.pattern.proxy;

import org.junit.Test;

/**
 * @author Created by Wesley on 2016/7/1.
 */
public class ProxyBuilderTest {

    @Test
    public void createJDKProxyObject() throws Exception {
        TestInterface proxy = (TestInterface)ProxyBuilder.createJDKProxyObject(new TestClass());
        System.out.println(proxy.getClass().getName());
        proxy.method1("abc");
        proxy.method2();
    }

    @Test
    public void createCglibProxyObject() throws Throwable{
        TestClass proxy = (TestClass)ProxyBuilder.createCglibProxyObject(new TestClass());
        System.out.println(proxy.getClass().getName());
        proxy.method1("qwe");
    }

}