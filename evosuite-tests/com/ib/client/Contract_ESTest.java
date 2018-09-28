/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 28 03:16:53 GMT 2018
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.ib.client.Contract;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Contract_ESTest extends Contract_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      UnderComp underComp1 = new UnderComp();
      contract0.m_underComp = underComp1;
      underComp1.m_conId = 665;
      contract0.equals(object0);
      assertEquals(0, contract0.m_conId);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      Contract contract1 = (Contract)contract0.clone();
      UnderComp underComp1 = new UnderComp();
      contract0.m_underComp = underComp1;
      boolean boolean0 = contract0.equals(contract1);
      assertTrue(boolean0);
      assertEquals(0, contract1.m_conId);
      assertNotSame(contract1, contract0);
      assertEquals(0.0, contract1.m_strike, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      boolean boolean0 = object0.equals(contract0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Contract contract0 = new Contract();
      Vector<Contract> vector0 = new Vector<Contract>();
      contract0.m_comboLegs = vector0;
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      vector0.add(contract0);
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_secId = "";
      contract0.m_secId = "com.ib.client.UnderComp";
      contract0.equals(object0);
      assertEquals(0.0, contract0.m_strike, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(0, "", "", "", 0.0, "", "", "", "", "", vector0, "", false, " v&yOx=", "SNn+qV!p7(:u");
      Contract contract1 = new Contract();
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = (Contract)contract0.clone();
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_localSymbol = "EeF>i:Eh b3U,g]*";
      boolean boolean0 = contract0.equals(contract1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = (Contract)contract0.clone();
      assertTrue(contract1.equals((Object)contract0));
      
      contract1.m_multiplier = "MwW>u2mI";
      boolean boolean0 = contract1.equals(contract0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_right = ".c_k'}";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(object0.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(51, "c", "/#DAta0:6kv", "/#DAta0:6kv", 51, "=]J", "=]J", "/#DAta0:6kv", "4=myux:-)={\"w-1bW", "ty[", vector0, "ty[", true, "ty[", "ty[");
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_expiry = "";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(object0.equals((Object)contract0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_strike = (-2180.399972128207);
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(0, "BOND", "BOND", "BOND", 0, "juHoBd&Zw~p-dG!", "com.ib.client.Contract", "BOND", "K`:viGl1B~", "BOND", vector0, "K`:viGl1B~", true, (String) null, "'C:C^'.gMkM1\"53A");
      Object object0 = contract0.clone();
      boolean boolean0 = contract0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Contract contract0 = new Contract();
      Object object0 = contract0.clone();
      assertTrue(object0.equals((Object)contract0));
      
      contract0.m_currency = "nW-|(}c2^d%6vcC)['4";
      boolean boolean0 = contract0.equals(object0);
      assertFalse(boolean0);
      assertFalse(object0.equals((Object)contract0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Contract contract0 = new Contract();
      contract0.m_exchange = "com.ib.client.Contract";
      contract0.m_symbol = "BOND";
      Contract contract1 = new Contract(0, "BOND", (String) null, (String) null, 0.0, "iX w", (String) null, "com.ib.client.Contract", "BOND", "BOND", contract0.m_comboLegs, "iX w", false, "BOND", "com.ib.client.Contract");
      contract0.equals(contract1);
      assertEquals(0, contract0.m_conId);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract1.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      Vector<Object> vector0 = new Vector<Object>(0, 0);
      Contract contract1 = new Contract(0, "", "", "", (-2742.106117720863), "", "`Ix", ">Z>,\"'y~:J^Ua", "", "`Ix", vector0, "", true, "{wDjjh?1(x`", (String) null);
      boolean boolean0 = contract0.equals(contract1);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(boolean0);
      assertTrue(contract1.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(0, "BOND", "", (String) null, 0.0, "W-$M", (String) null, (String) null, "BOND", "com.ib.client.Contract", contract0.m_comboLegs, "/#DAta0:6kv", false, "", "n5g!,:d&@I<_");
      boolean boolean0 = contract0.equals(contract1);
      assertEquals(0.0, contract1.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertFalse(boolean0);
      assertFalse(contract1.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract();
      Contract contract1 = new Contract(0, "BOND", "BOND", "BOND", 0, "juHoBd&Zw~p-dG!", "com.ib.client.Contract", "BOND", "K`:viGl1B~", "BOND", vector0, "K`:viGl1B~", true, (String) null, "'C:C^'.gMkM1\"53A");
      boolean boolean0 = contract1.equals(contract0);
      assertFalse(boolean0);
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertTrue(contract1.m_includeExpired);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      boolean boolean0 = contract0.equals("");
      assertFalse(contract0.m_includeExpired);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(boolean0);
      assertEquals(0, contract0.m_conId);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Contract contract0 = new Contract();
      boolean boolean0 = contract0.equals((Object) null);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertFalse(contract0.m_includeExpired);
      assertFalse(boolean0);
      assertEquals(0, contract0.m_conId);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract((-4110), (String) null, "beZkY\".=O2", (String) null, 1.0, (String) null, "z[IGj@~cC", "", "BOND", "", contract0.m_comboLegs, (String) null, false, "B.A", (String) null);
      contract0.equals(contract1);
      assertEquals(0.0, contract0.m_strike, 0.01);
      assertEquals((-4110), contract1.m_conId);
      assertFalse(contract1.m_includeExpired);
      assertEquals(1.0, contract1.m_strike, 0.01);
  }
}
