/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 11:17:21 GMT 2019
 */

package sortpom.processinstruction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sortpom.processinstruction.IgnoredSectionsStore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IgnoredSectionsStore_ESTest extends IgnoredSectionsStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IgnoredSectionsStore ignoredSectionsStore0 = new IgnoredSectionsStore();
      String string0 = ignoredSectionsStore0.revertIgnoredSections("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IgnoredSectionsStore ignoredSectionsStore0 = new IgnoredSectionsStore();
      String string0 = ignoredSectionsStore0.replaceIgnoredSections("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IgnoredSectionsStore ignoredSectionsStore0 = new IgnoredSectionsStore();
      // Undeclared exception!
      try { 
        ignoredSectionsStore0.revertIgnoredSections((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IgnoredSectionsStore ignoredSectionsStore0 = new IgnoredSectionsStore();
      // Undeclared exception!
      try { 
        ignoredSectionsStore0.replaceIgnoredSections((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IgnoredSectionsStore ignoredSectionsStore0 = new IgnoredSectionsStore();
      String string0 = ignoredSectionsStore0.revertIgnoredSections("mkFyR7nuWC2");
      assertEquals("mkFyR7nuWC2", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IgnoredSectionsStore ignoredSectionsStore0 = new IgnoredSectionsStore();
      String string0 = ignoredSectionsStore0.replaceIgnoredSections("mkFyR7nuWC2");
      assertEquals("mkFyR7nuWC2", string0);
  }
}
