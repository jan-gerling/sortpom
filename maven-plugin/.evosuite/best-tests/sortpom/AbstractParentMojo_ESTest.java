/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 11:38:55 GMT 2019
 */

package sortpom;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.maven.plugin.MojoFailureException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sortpom.SortMojo;
import sortpom.VerifyMojo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractParentMojo_ESTest extends AbstractParentMojo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SortMojo sortMojo0 = new SortMojo();
      sortMojo0.lineSeparator = "K";
      try { 
        sortMojo0.execute();
        fail("Expecting exception: MojoFailureException");
      
      } catch(MojoFailureException e) {
         //
         // LineSeparator must be either \\n, \\r or \\r\\n, but separator characters were [75]
         //
         verifyException("sortpom.exception.ExceptionConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VerifyMojo verifyMojo0 = new VerifyMojo();
      verifyMojo0.skip = true;
      verifyMojo0.execute();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortMojo sortMojo0 = new SortMojo();
      // Undeclared exception!
      try { 
        sortMojo0.execute();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.parameter.LineSeparatorUtil", e);
      }
  }
}
