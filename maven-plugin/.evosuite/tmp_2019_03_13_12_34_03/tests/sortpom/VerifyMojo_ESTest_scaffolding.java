/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Mar 13 11:41:40 GMT 2019
 */

package sortpom;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class VerifyMojo_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "sortpom.VerifyMojo"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Jan\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "DE"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Jan\\Documents\\sortpom\\maven-plugin"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Jan"); 
    java.lang.System.setProperty("user.language", "de"); 
    java.lang.System.setProperty("user.name", "Jan"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(VerifyMojo_ESTest_scaffolding.class.getClassLoader() ,
      "sortpom.AbstractParentMojo",
      "sortpom.util.FileUtil",
      "org.jdom.Comment",
      "sortpom.XmlOutputGenerator",
      "sortpom.XmlOutputGenerator$PatchedXMLOutputter",
      "sortpom.logger.SortPomLogger",
      "sortpom.parameter.LineSeparatorUtil",
      "sortpom.wrapper.operation.WrapperFactory",
      "org.jdom.output.XMLOutputter",
      "org.jdom.Content",
      "sortpom.jdomcontent.NewlineText",
      "sortpom.processinstruction.XmlProcessingInstructionParser",
      "sortpom.processinstruction.IgnoredSectionsStore",
      "org.jdom.JDOMException",
      "sortpom.XmlProcessor",
      "sortpom.SortPomImpl",
      "sortpom.wrapper.content.Wrapper",
      "sortpom.util.BufferedLineSeparatorOutputStream",
      "sortpom.wrapper.ElementSortOrderMap",
      "sortpom.exception.FailureException",
      "sortpom.wrapper.WrapperFactoryImpl",
      "org.jdom.Text",
      "sortpom.wrapper.TextWrapperCreator",
      "sortpom.exception.ExceptionConverter",
      "org.jdom.Parent",
      "sortpom.parameter.PluginParameters$Builder",
      "org.jdom.Element",
      "sortpom.VerifyMojo",
      "sortpom.wrapper.ElementWrapperCreator",
      "sortpom.parameter.PluginParameters"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(VerifyMojo_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "sortpom.AbstractParentMojo",
      "sortpom.VerifyMojo",
      "sortpom.SortPomImpl",
      "sortpom.util.FileUtil",
      "sortpom.wrapper.WrapperFactoryImpl",
      "sortpom.wrapper.ElementSortOrderMap",
      "sortpom.wrapper.ElementWrapperCreator",
      "sortpom.wrapper.TextWrapperCreator",
      "sortpom.XmlProcessor",
      "sortpom.processinstruction.XmlProcessingInstructionParser",
      "sortpom.processinstruction.IgnoredSectionsStore",
      "sortpom.XmlOutputGenerator",
      "sortpom.exception.ExceptionConverter",
      "sortpom.parameter.PluginParameters",
      "sortpom.parameter.PluginParameters$Builder",
      "sortpom.parameter.LineSeparatorUtil",
      "sortpom.exception.FailureException",
      "sortpom.parameter.IndentCharacters",
      "sortpom.parameter.DependencySortOrder",
      "sortpom.parameter.VerifyFailType"
    );
  }
}
