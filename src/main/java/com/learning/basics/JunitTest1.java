package com.learning.basics;


import org.junit.*;


public class JunitTest1 {

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("before class");
    }
    @Before
    public void setUp(){
        System.out.println("before");
    }

    @After
    public void tearDown(){
        System.out.println("after");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("after class");
    }
}
