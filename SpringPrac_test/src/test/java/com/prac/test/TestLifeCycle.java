package com.prac.test;

import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeall test");
        System.out.println();
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterall test");
        System.out.println();
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("beforeeach test");
        System.out.println();
    }

    @AfterEach
    void afterEach(){
        System.out.println("aftereach test");
        System.out.println();
    }

    @Test
    void test1(){
        System.out.println("test1");
        System.out.println();
    }

    @Test
    @DisplayName("test case 2")
    void test2(){
        System.out.println("test2 start");
        System.out.println();
    }

    @Test
    @Disabled
    void test3(){
        System.out.println("test3 start");
        System.out.println();
    }
}
