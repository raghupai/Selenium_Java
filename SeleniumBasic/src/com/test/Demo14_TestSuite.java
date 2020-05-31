package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//RunWith annotaion
@RunWith(Suite.class)

//@SuiteClass with the .class file name which needs to run as a suite
@SuiteClasses({ Demo04_LoginLogOut.class, Demo05_AssertWelcomeMessage.class, Demo10_ExcelReading.class })
public class Demo14_TestSuite {

}
