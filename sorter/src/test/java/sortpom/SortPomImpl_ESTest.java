/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 10:50:05 GMT 2019
 */

package sortpom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import sortpom.SortPomImpl;
import sortpom.logger.SortPomLogger;
import sortpom.parameter.PluginParameters;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortPomImpl_ESTest extends SortPomImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SortPomImpl sortPomImpl0 = new SortPomImpl();
      // Undeclared exception!
      try { 
        sortPomImpl0.verifyPom();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.SortPomImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SortPomImpl sortPomImpl0 = new SortPomImpl();
      // Undeclared exception!
      try { 
        sortPomImpl0.sortPom();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.SortPomImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortPomImpl sortPomImpl0 = new SortPomImpl();
      // Undeclared exception!
      try { 
        sortPomImpl0.isPomElementsSorted();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SortPomImpl sortPomImpl0 = new SortPomImpl();
      SortPomLogger sortPomLogger0 = mock(SortPomLogger.class, new ViolatedAssumptionAnswer());
      PluginParameters pluginParameters0 = mock(PluginParameters.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sortPomImpl0.setup(sortPomLogger0, pluginParameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.SortPomImpl", e);
      }
  }
}
