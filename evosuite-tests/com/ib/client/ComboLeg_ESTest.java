/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 28 03:14:11 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.ComboLeg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComboLeg_ESTest extends ComboLeg_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg();
      comboLeg0.m_designatedLocation = "com.ib.client.Util";
      ComboLeg comboLeg1 = new ComboLeg(0, 0, (String) null, (String) null, 0, 0, (String) null);
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertFalse(comboLeg1.equals((Object)comboLeg0));
      assertEquals(0, comboLeg1.m_ratio);
      assertFalse(boolean0);
      assertEquals(0, comboLeg1.m_conId);
      assertEquals(0, comboLeg1.m_shortSaleSlot);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg();
      ComboLeg comboLeg1 = new ComboLeg(0, 0, (String) null, (String) null, 0, 0, (String) null);
      assertTrue(comboLeg1.equals((Object)comboLeg0));
      
      comboLeg1.m_exchange = "I_F%'\":%&";
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertFalse(comboLeg1.equals((Object)comboLeg0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg(0, 0, "<c|RXH>v3mrV)Ym`U>m", "com.ib.client.ComboLeg", 0);
      ComboLeg comboLeg1 = new ComboLeg();
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertFalse(boolean0);
      assertEquals(0, comboLeg1.m_openClose);
      assertEquals(0, comboLeg1.m_conId);
      assertEquals(0, comboLeg1.m_shortSaleSlot);
      assertEquals(0, comboLeg1.m_ratio);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg();
      ComboLeg comboLeg1 = new ComboLeg(0, 0, (String) null, (String) null, 0, (-21), (String) null);
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertEquals(0, comboLeg1.m_openClose);
      assertFalse(comboLeg1.equals((Object)comboLeg0));
      assertEquals(0, comboLeg1.m_ratio);
      assertEquals((-21), comboLeg1.m_shortSaleSlot);
      assertFalse(boolean0);
      assertEquals(0, comboLeg1.m_conId);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg();
      ComboLeg comboLeg1 = new ComboLeg(0, 0, (String) null, (String) null, 0, 0, (String) null);
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertEquals(0, comboLeg1.m_ratio);
      assertEquals(0, comboLeg1.m_shortSaleSlot);
      assertEquals(0, comboLeg1.m_conId);
      assertEquals(0, comboLeg1.m_openClose);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg();
      ComboLeg comboLeg1 = new ComboLeg();
      assertEquals(0, comboLeg1.m_ratio);
      
      comboLeg1.m_ratio = 2141;
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg((-691), 0, "", "", (-691));
      assertEquals((-691), comboLeg0.m_conId);
      
      comboLeg0.m_conId = 82;
      ComboLeg comboLeg1 = new ComboLeg(82, 0, "e.8?=wVR`jRlgBP6'L", "", 0, (-4334), "");
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg();
      boolean boolean0 = comboLeg0.equals((Object) null);
      assertEquals(0, comboLeg0.m_conId);
      assertEquals(0, comboLeg0.m_shortSaleSlot);
      assertFalse(boolean0);
      assertEquals(0, comboLeg0.m_openClose);
      assertEquals(0, comboLeg0.m_ratio);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ComboLeg comboLeg0 = new ComboLeg((-691), 0, "", "", (-691));
      ComboLeg comboLeg1 = new ComboLeg(82, 0, "e.8?=wVR`jRlgBP6'L", "", 0, (-4334), "");
      boolean boolean0 = comboLeg0.equals(comboLeg1);
      assertEquals(0, comboLeg1.m_openClose);
      assertEquals(0, comboLeg0.m_ratio);
      assertEquals(82, comboLeg1.m_conId);
      assertFalse(boolean0);
      assertEquals((-4334), comboLeg1.m_shortSaleSlot);
      assertEquals((-691), comboLeg0.m_openClose);
      assertEquals(0, comboLeg1.m_ratio);
  }
}
