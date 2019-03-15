/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 11:27:37 GMT 2019
 */

package sortpom.wrapper.operation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdom.Element;
import org.junit.runner.RunWith;
import sortpom.wrapper.content.DependencySortedWrapper;
import sortpom.wrapper.content.Wrapper;
import sortpom.wrapper.operation.SortAttributesOperation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SortAttributesOperation_ESTest extends SortAttributesOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SortAttributesOperation sortAttributesOperation0 = new SortAttributesOperation();
      // Undeclared exception!
      try { 
        sortAttributesOperation0.processElement((Wrapper<Element>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.wrapper.operation.SortAttributesOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SortAttributesOperation sortAttributesOperation0 = new SortAttributesOperation();
      Element element0 = new Element("sortpom.wrapper.operation.SortAttributesOperation", "mCthB");
      DependencySortedWrapper dependencySortedWrapper0 = new DependencySortedWrapper(element0, 0);
      sortAttributesOperation0.processElement(dependencySortedWrapper0);
  }
}