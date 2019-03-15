/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 13 11:15:02 GMT 2019
 */

package sortpom.wrapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jdom.Content;
import org.jdom.Text;
import org.junit.runner.RunWith;
import sortpom.parameter.PluginParameters;
import sortpom.wrapper.TextWrapperCreator;
import sortpom.wrapper.content.Wrapper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextWrapperCreator_ESTest extends TextWrapperCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextWrapperCreator textWrapperCreator0 = new TextWrapperCreator();
      boolean boolean0 = textWrapperCreator0.isBlankLineOrLines((Text) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextWrapperCreator textWrapperCreator0 = new TextWrapperCreator();
      // Undeclared exception!
      try { 
        textWrapperCreator0.setup((PluginParameters) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.wrapper.TextWrapperCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextWrapperCreator textWrapperCreator0 = new TextWrapperCreator();
      // Undeclared exception!
      try { 
        textWrapperCreator0.createWrapper((Text) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("sortpom.wrapper.TextWrapperCreator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextWrapperCreator textWrapperCreator0 = new TextWrapperCreator();
      Text text0 = new Text((String) null);
      text0.setText("y|=p|");
      Wrapper<Content> wrapper0 = textWrapperCreator0.createWrapper(text0);
      assertNotNull(wrapper0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TextWrapperCreator textWrapperCreator0 = new TextWrapperCreator();
      PluginParameters pluginParameters0 = mock(PluginParameters.class, new ViolatedAssumptionAnswer());
      textWrapperCreator0.setup(pluginParameters0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TextWrapperCreator textWrapperCreator0 = new TextWrapperCreator();
      Text text0 = new Text((String) null);
      Wrapper<Content> wrapper0 = textWrapperCreator0.createWrapper(text0);
      assertNotNull(wrapper0);
  }
}
