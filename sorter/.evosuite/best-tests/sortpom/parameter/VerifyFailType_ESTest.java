/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 11:08:46 GMT 2019
 */

package sortpom.parameter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sortpom.parameter.VerifyFailType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VerifyFailType_ESTest extends VerifyFailType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VerifyFailType[] verifyFailTypeArray0 = VerifyFailType.values();
      assertEquals(3, verifyFailTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VerifyFailType verifyFailType0 = VerifyFailType.valueOf("SORT");
      assertEquals(VerifyFailType.SORT, verifyFailType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        VerifyFailType.fromString("warp");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // verifyFail must be either SORT, WARN or STOP. Was: warp
         //
         verifyException("sortpom.parameter.VerifyFailType", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VerifyFailType verifyFailType0 = VerifyFailType.fromString("WARN");
      assertEquals(VerifyFailType.WARN, verifyFailType0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VerifyFailType verifyFailType0 = VerifyFailType.fromString("SORT");
      assertEquals(VerifyFailType.SORT, verifyFailType0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        VerifyFailType.fromString((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // verifyFail must be either SORT, WARN or STOP. Was: null
         //
         verifyException("sortpom.parameter.VerifyFailType", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VerifyFailType verifyFailType0 = VerifyFailType.fromString("STOP");
      assertEquals(VerifyFailType.STOP, verifyFailType0);
  }
}
