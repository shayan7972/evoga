/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 02 04:36:28 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.UnderComp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnderComp_ESTest extends UnderComp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      assertEquals(0.0, underComp0.m_delta, 0.01);
      
      underComp0.m_delta = (-985.062915);
      UnderComp underComp1 = new UnderComp();
      boolean boolean0 = underComp0.equals(underComp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      UnderComp underComp1 = new UnderComp();
      assertEquals(0.0, underComp1.m_price, 0.01);
      
      underComp1.m_price = 1584.959951342;
      boolean boolean0 = underComp1.equals(underComp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      assertEquals(0, underComp0.m_conId);
      
      underComp0.m_conId = 1;
      UnderComp underComp1 = new UnderComp();
      boolean boolean0 = underComp0.equals(underComp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      assertEquals(0.0, underComp0.m_price, 0.01);
      
      underComp0.m_price = (double) 431;
      UnderComp underComp1 = new UnderComp();
      boolean boolean0 = underComp1.equals(underComp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      assertEquals(0.0, underComp0.m_delta, 0.01);
      
      underComp0.m_delta = 2579.9;
      UnderComp underComp1 = new UnderComp();
      boolean boolean0 = underComp0.equals(underComp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      UnderComp underComp1 = new UnderComp();
      assertEquals(0, underComp1.m_conId);
      
      underComp1.m_conId = 356;
      boolean boolean0 = underComp0.equals(underComp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      UnderComp underComp1 = new UnderComp();
      boolean boolean0 = underComp0.equals(underComp1);
      assertEquals(0, underComp1.m_conId);
      assertEquals(0.0, underComp1.m_price, 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, underComp1.m_delta, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      boolean boolean0 = underComp0.equals((Object) null);
      assertEquals(0, underComp0.m_conId);
      assertEquals(0.0, underComp0.m_delta, 0.01);
      assertEquals(0.0, underComp0.m_price, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      boolean boolean0 = underComp0.equals(underComp0);
      assertEquals(0, underComp0.m_conId);
      assertEquals(0.0, underComp0.m_delta, 0.01);
      assertEquals(0.0, underComp0.m_price, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      Object object0 = new Object();
      boolean boolean0 = underComp0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0.0, underComp0.m_delta, 0.01);
      assertEquals(0, underComp0.m_conId);
      assertEquals(0.0, underComp0.m_price, 0.01);
  }
}
