/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 28 03:18:48 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.AnyWrapperMsgGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnyWrapperMsgGenerator_ESTest extends AnyWrapperMsgGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.connectionClosed();
      assertEquals("Connection Closed", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error((-1013), (-1013), "");
      assertEquals("-1013 | -1013 | ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockException mockException0 = new MockException("");
      String string0 = AnyWrapperMsgGenerator.ioError(mockException0);
      assertEquals("Error - org.evosuite.runtime.mock.java.lang.MockThrowable: ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AnyWrapperMsgGenerator anyWrapperMsgGenerator0 = new AnyWrapperMsgGenerator();
      assertEquals("Connection Closed", anyWrapperMsgGenerator0.connectionClosed());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = AnyWrapperMsgGenerator.error("");
      assertEquals("", string0);
  }
}
