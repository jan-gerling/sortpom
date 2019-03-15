/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 11:12:31 GMT 2019
 */

package sortpom.wrapper.operation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdom.Comment;
import org.jdom.Content;
import org.jdom.Element;
import org.junit.runner.RunWith;
import sortpom.wrapper.content.DependencySortedWrapper;
import sortpom.wrapper.content.SingleNewlineInTextWrapper;
import sortpom.wrapper.content.UnsortedWrapper;
import sortpom.wrapper.content.Wrapper;
import sortpom.wrapper.operation.HierarchyWrapper;
import sortpom.wrapper.operation.HierarchyWrapperOperation;
import sortpom.wrapper.operation.ToStringOperation;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ToStringOperation_ESTest extends ToStringOperation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      SingleNewlineInTextWrapper singleNewlineInTextWrapper0 = SingleNewlineInTextWrapper.INSTANCE;
      toStringOperation0.processOtherContent(singleNewlineInTextWrapper0);
      String string0 = toStringOperation0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      // Undeclared exception!
      try { 
        toStringOperation0.processOtherContent((Wrapper<Content>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.wrapper.operation.ToStringOperation", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      // Undeclared exception!
      try { 
        toStringOperation0.manipulateChildElements((List<HierarchyWrapper>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      LinkedList<HierarchyWrapper> linkedList0 = new LinkedList<HierarchyWrapper>();
      toStringOperation0.manipulateChildElements(linkedList0);
      assertEquals("", toStringOperation0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      toStringOperation0.startOfProcess();
      SingleNewlineInTextWrapper singleNewlineInTextWrapper0 = SingleNewlineInTextWrapper.INSTANCE;
      toStringOperation0.processOtherContent(singleNewlineInTextWrapper0);
      assertEquals("SingleNewlineInTextWrapper", singleNewlineInTextWrapper0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      toStringOperation0.endOfProcess();
      assertEquals("  }\n", toStringOperation0.toString());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      HierarchyWrapperOperation hierarchyWrapperOperation0 = toStringOperation0.createSubOperation();
      assertNotSame(toStringOperation0, hierarchyWrapperOperation0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      String string0 = toStringOperation0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<HierarchyWrapper> linkedList0 = new LinkedList<HierarchyWrapper>();
      UnsortedWrapper<Comment> unsortedWrapper0 = new UnsortedWrapper<Comment>((Comment) null);
      HierarchyWrapper hierarchyWrapper0 = new HierarchyWrapper(unsortedWrapper0);
      linkedList0.add(hierarchyWrapper0);
      ToStringOperation toStringOperation0 = new ToStringOperation();
      toStringOperation0.manipulateChildElements(linkedList0);
      assertEquals("  children=\n", toStringOperation0.toString());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ToStringOperation toStringOperation0 = new ToStringOperation();
      DependencySortedWrapper dependencySortedWrapper0 = new DependencySortedWrapper((Element) null, 0);
      toStringOperation0.processElement(dependencySortedWrapper0);
      assertEquals("  elementContent=DependencySortedWrapper{childElementSorter=ChildElementSorter{childElementTexts=[]}}\n", toStringOperation0.toString());
  }
}
