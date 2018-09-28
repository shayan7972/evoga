/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 28 03:11:11 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.ExecutionFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExecutionFilter_ESTest extends ExecutionFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      executionFilter0.m_acctCode = "+/%yl";
      executionFilter0.m_symbol = "+/%yl";
      executionFilter0.m_time = "+/%yl";
      executionFilter0.m_exchange = "+/%yl";
      executionFilter0.m_secType = "+/%yl";
      executionFilter0.m_side = "+/%yl";
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "+/%yl", "+/%yl", "+/%yl", "+/%yl", "+/%yl", "+/%yl");
      boolean boolean0 = executionFilter1.equals(executionFilter0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      executionFilter0.m_acctCode = "";
      executionFilter0.m_symbol = "";
      executionFilter0.m_time = "";
      executionFilter0.m_exchange = "";
      executionFilter0.m_secType = "";
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "", "", "", "", "", "");
      boolean boolean0 = executionFilter1.equals(executionFilter0);
      assertFalse(boolean0);
      assertEquals(0, executionFilter1.m_clientId);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      executionFilter0.m_acctCode = "+/%yl";
      executionFilter0.m_symbol = "";
      executionFilter0.m_symbol = "+/%yl";
      executionFilter0.m_time = "+/%yl";
      executionFilter0.m_secType = "";
      executionFilter0.m_secType = "+/%yl";
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "+/%yl", "+/%yl", "+/%yl", "+/%yl", "+/%yl", "");
      boolean boolean0 = executionFilter1.equals(executionFilter0);
      assertFalse(boolean0);
      assertEquals(0, executionFilter1.m_clientId);
      assertEquals(0, executionFilter0.m_clientId);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      executionFilter0.m_acctCode = "+/%yl";
      executionFilter0.m_symbol = "";
      executionFilter0.m_symbol = "+/%yl";
      executionFilter0.m_time = "+/%yl";
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "+/%yl", "+/%yl", "+/%yl", "+/%yl", "+/%yl", "");
      boolean boolean0 = executionFilter1.equals(executionFilter0);
      assertEquals(0, executionFilter0.m_clientId);
      assertEquals(0, executionFilter1.m_clientId);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      executionFilter0.m_acctCode = "+/%yl";
      executionFilter0.m_time = "+/%yl";
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "+/%yl", "+/%yl", "+/%yl", "+/%yl", "+/%yl", "");
      boolean boolean0 = executionFilter1.equals(executionFilter0);
      assertEquals(0, executionFilter1.m_clientId);
      assertEquals(0, executionFilter0.m_clientId);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      executionFilter0.m_acctCode = "+/%yl";
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "+/%yl", "+/%yl", "+/%yl", "+/%yl", "+/%yl", "");
      boolean boolean0 = executionFilter1.equals(executionFilter0);
      assertFalse(boolean0);
      assertEquals(0, executionFilter1.m_clientId);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      assertEquals(0, executionFilter0.m_clientId);
      
      executionFilter0.m_acctCode = "+/%yl";
      executionFilter0.m_clientId = (-331);
      ExecutionFilter executionFilter1 = new ExecutionFilter((-331), "", "7?k4+aJa", (String) null, "55AIB/c3n?x", (String) null, "");
      boolean boolean0 = executionFilter0.equals(executionFilter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      ExecutionFilter executionFilter1 = new ExecutionFilter((-331), "", "7?k4+aJa", (String) null, "55AIB/c3n?x", (String) null, "");
      boolean boolean0 = executionFilter0.equals(executionFilter1);
      assertEquals((-331), executionFilter1.m_clientId);
      assertEquals(0, executionFilter0.m_clientId);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      boolean boolean0 = executionFilter0.equals((Object) null);
      assertEquals(0, executionFilter0.m_clientId);
      assertFalse(boolean0);
  }
}
