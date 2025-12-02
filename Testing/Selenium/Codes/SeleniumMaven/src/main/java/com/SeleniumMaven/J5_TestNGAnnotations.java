package com.SeleniumMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


/*
BeforeSuite: @BeforeSuite is one of the TestNG Annotations. As the name defines, @BeforeSuite is executed before the execution of all the test cases inside a TestNG Suite.

AfterSuite: @AfterSuite is one of the TestNG Annotations. As the name defines, @AfterSuite is executed after the execution of all the test cases inside a TestNG Suite.

BeforeTest: @BeforeTest is one of the TestNG Annotations. As the name defines, @BeforeTest is executed before the execution of all the @test annotated methods inside a TestNG Suite

AfterTest: @AfterTest is one of the TestNG Annotations. As the name defines, @AfterTest is executed after the execution of all the @test annotated methods inside a TestNG Suite.

BeforeClass: @BeforeClass is one of the TestNG Annotations. As the name defines, @BeforeClass is executed before all the methods of the current class start their execution.

AfterClass: @AfterClass is one of the TestNG Annotations. As the name defines, @AfterClass is executed after all the methods of the current class finish their execution.

BeforeMethod: @BeforeMethod is one of the TestNG Annotations. As the name itself defines, @BeforeMethod is executed before each test method within a test class. Suppose there are n test methods within a test class, then n times @BeforeMethod annotated method will be invoked.

AfterMethod: @AfterMethod is one of the TestNG Annotations. As the name defines, @AfterMethod is executed after each test method within a test class. Suppose there are n test methods within a test class, then n times @AfterMethod annotated method will be invoked.

BeforeGroups: @BeforeGroups is one of the TestNG Annotations. When you annotate a method with @BeforeGroups, TestNG ensures that this method is invoked before any test method belonging to the specified groups is executed.

AfterGroup: @AfterGroups is one of the TestNG Annotations. As the name defines, @AfterGroups should be executed after all the test methods belonging to a specified group have been run.
* */

public class J5_TestNGAnnotations {
    @Test
    public void test1() {
        System.out.println("Test Case 1");
    }
    @Test
    public void test2() {
        System.out.println("Test Case 2");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will Execute Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will Execute After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will Execute Before Class Execution");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will Execute After Class Execution");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will Execute Before Test ");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will Execute After Test ");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will Execute Before Suite ");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will Execute After Suite ");
    }

}
