/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Mar 13 11:12:31 GMT 2019
 */

package sortpom.wrapper.operation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ToStringOperation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "sortpom.wrapper.operation.ToStringOperation"; 
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
    java.lang.System.setProperty("user.dir", "C:\\Users\\Jan\\Documents\\sortpom\\sorter"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Jan"); 
    java.lang.System.setProperty("user.language", "de"); 
    java.lang.System.setProperty("user.name", "Jan"); 
    java.lang.System.setProperty("user.timezone", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ToStringOperation_ESTest_scaffolding.class.getClassLoader() ,
      "sortpom.util.FileUtil",
      "org.apache.commons.io.LineIterator",
      "sortpom.wrapper.operation.HierarchyRootWrapper",
      "sortpom.wrapper.content.SingleNewlineInTextWrapper",
      "org.jdom.output.XMLOutputter",
      "org.jdom.filter.ContentFilter",
      "org.jdom.ContentList$FilterListIterator",
      "org.jdom.Document",
      "org.jdom.JDOMException",
      "sortpom.wrapper.content.ModuleSortedWrapper",
      "org.jdom.FilterIterator",
      "org.jdom.Namespace",
      "org.jdom.Verifier",
      "org.jdom.IllegalNameException",
      "org.jdom.NamespaceKey",
      "sortpom.parameter.DependencySortOrder",
      "org.jdom.ContentList$FilterList",
      "org.jdom.DescendantIterator",
      "sortpom.wrapper.ElementSortOrderMap",
      "sortpom.wrapper.content.DependencySortedWrapper",
      "org.jdom.filter.ElementFilter",
      "sortpom.wrapper.content.SortedWrapper",
      "org.jdom.IllegalDataException",
      "org.jdom.Text",
      "org.apache.commons.io.output.ByteArrayOutputStream",
      "sortpom.wrapper.TextWrapperCreator",
      "org.jdom.Attribute",
      "sortpom.wrapper.operation.HierarchyWrapperOperation",
      "org.jdom.Parent",
      "org.apache.commons.io.IOUtils",
      "sortpom.wrapper.operation.DetachOperation",
      "org.jdom.output.Format$DefaultEscapeStrategy",
      "org.jdom.filter.OrFilter",
      "sortpom.parameter.PluginParameters",
      "sortpom.wrapper.operation.SortChildrenOperation",
      "org.jdom.filter.Filter",
      "sortpom.wrapper.operation.HierarchyWrapper",
      "org.jdom.Comment",
      "org.jdom.output.Format$TextMode",
      "org.jdom.output.Format",
      "org.jdom.output.NamespaceStack",
      "sortpom.wrapper.operation.WrapperFactory",
      "org.jdom.Content",
      "sortpom.jdomcontent.NewlineText",
      "org.jdom.output.XMLOutputter$NamespaceStack",
      "org.jdom.CDATA",
      "sortpom.wrapper.operation.SortAttributesOperation",
      "sortpom.wrapper.ElementUtil",
      "org.apache.commons.io.output.StringBuilderWriter",
      "org.jdom.DocType",
      "sortpom.wrapper.content.Wrapper",
      "org.jdom.filter.AbstractFilter",
      "sortpom.wrapper.operation.ToStringOperation",
      "org.jdom.ProcessingInstruction",
      "org.apache.commons.io.Charsets",
      "sortpom.wrapper.operation.GetContentStructureOperation",
      "org.apache.commons.io.input.ClosedInputStream",
      "org.jdom.DataConversionException",
      "sortpom.exception.FailureException",
      "sortpom.wrapper.WrapperFactoryImpl",
      "sortpom.wrapper.content.ChildElementSorter",
      "org.jdom.EntityRef",
      "sortpom.wrapper.content.PluginSortedWrapper",
      "sortpom.wrapper.content.ChildElementSorter$Scope",
      "sortpom.wrapper.content.AlphabeticalSortedWrapper",
      "sortpom.parameter.PluginParameters$Builder",
      "org.jdom.IllegalTargetException",
      "org.jdom.AttributeList",
      "org.jdom.ContentList",
      "org.jdom.output.EscapeStrategy",
      "org.jdom.IllegalAddException",
      "sortpom.wrapper.content.UnsortedWrapper",
      "org.jdom.Element",
      "sortpom.wrapper.ElementWrapperCreator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ToStringOperation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "sortpom.wrapper.operation.ToStringOperation",
      "sortpom.util.FileUtil",
      "sortpom.wrapper.WrapperFactoryImpl",
      "sortpom.wrapper.ElementSortOrderMap",
      "sortpom.wrapper.ElementWrapperCreator",
      "sortpom.wrapper.TextWrapperCreator",
      "org.jdom.Content",
      "org.jdom.ProcessingInstruction",
      "org.jdom.Verifier",
      "org.jdom.IllegalTargetException",
      "org.jdom.Comment",
      "sortpom.wrapper.content.UnsortedWrapper",
      "sortpom.wrapper.operation.HierarchyWrapper",
      "sortpom.wrapper.content.SingleNewlineInTextWrapper",
      "sortpom.wrapper.content.SortedWrapper",
      "sortpom.wrapper.content.DependencySortedWrapper",
      "sortpom.wrapper.content.ChildElementSorter",
      "sortpom.wrapper.content.PluginSortedWrapper",
      "org.jdom.Element",
      "org.jdom.NamespaceKey",
      "org.jdom.Namespace",
      "org.jdom.AttributeList",
      "org.jdom.ContentList",
      "org.jdom.IllegalNameException",
      "org.jdom.Attribute",
      "org.jdom.output.Format",
      "org.jdom.output.Format$TextMode",
      "org.jdom.output.Format$DefaultEscapeStrategy",
      "org.jdom.output.XMLOutputter",
      "org.jdom.Text",
      "org.jdom.CDATA",
      "sortpom.wrapper.content.AlphabeticalSortedWrapper",
      "org.jdom.DocType",
      "org.jdom.filter.AbstractFilter",
      "org.jdom.filter.ElementFilter",
      "org.jdom.ContentList$FilterList",
      "org.jdom.ContentList$FilterListIterator",
      "org.apache.commons.io.output.StringBuilderWriter",
      "org.apache.commons.io.IOUtils",
      "org.apache.commons.io.Charsets",
      "org.jdom.EntityRef",
      "org.jdom.IllegalAddException",
      "sortpom.parameter.PluginParameters",
      "org.jdom.IllegalDataException",
      "sortpom.wrapper.content.ModuleSortedWrapper",
      "sortpom.wrapper.ElementUtil",
      "org.jdom.filter.ContentFilter",
      "org.jdom.filter.OrFilter",
      "org.jdom.DescendantIterator",
      "org.jdom.FilterIterator",
      "sortpom.parameter.DependencySortOrder",
      "sortpom.wrapper.operation.SortAttributesOperation",
      "sortpom.wrapper.operation.DetachOperation",
      "sortpom.wrapper.operation.GetContentStructureOperation",
      "sortpom.wrapper.operation.SortChildrenOperation",
      "org.jdom.JDOMException",
      "org.jdom.DataConversionException"
    );
  }
}
