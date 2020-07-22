package tests.calculator;

import static org.junit.Assert.assertTrue;
import static resources.SikuliDesktop.FindElement;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.sikuli.script.*;
import org.junit.*;
import resources.SikuliApp;
import resources.SikuliElement;
import resources.SikuliSettings;
import resources.calculator.steps.CalculatorSteps;

@RunWith(JUnit4.class)
public class additionTest {

  // TODO: call page methods from Cucumber step definitions
  // TODO: convert project to JUnit 5 or TestNG to get more test setup methods and assertions?
  // TODO: use WinAppDriver methods (more reliable) to manage app instead of Sikuli?
  public static SikuliApp calculatorApp;

  @BeforeClass
  public static void setupAdditionTest() {
    calculatorApp = new SikuliApp("c://Windows//System32//calc.exe","Calculator");
  }

  @AfterClass
  public static void teardownAdditionTest() {
    calculatorApp.close(); //TODO: use WinAppDriver to open and close the app?
  }

  @Test
  public void testAddition() {
    ImagePath.setBundlePath(SikuliSettings.BASE_IMAGEPATH);
    CalculatorSteps calculatorSteps = new CalculatorSteps();
    boolean isOutcomeImageFound = false;

    // FIXME: check the calculator mask image. different Calculator app versions?
    //assertTrue("Unable to limit search to Calculator window", calculatorSteps.limitSearchToCalculatorWindow());
    assertTrue("Addition test failed during Given steps.", calculatorSteps.additionTestGivenSteps());
    assertTrue("Addition test failed during When steps.", calculatorSteps.additionTestWhenSteps());

    SikuliElement additionTestOutcome = new SikuliElement("calculator/images/assertions/addition_test_outcome.png", "1 + 2 = 3");
    isOutcomeImageFound = FindElement(additionTestOutcome);
    assertTrue("Test outcome image not found", isOutcomeImageFound);
  }

//  @Test
//  public void testAdditionOCR() {
//    ImagePath.setBundlePath(SikuliSettings.BASE_IMAGEPATH);
//    CalculatorSteps calculatorSteps = new CalculatorSteps();
//    boolean isOutcomeImageFound = false;
//
//    assertTrue("Unable to limit search to Calculator window", calculatorSteps.limitSearchToCalculatorWindow());
//    assertTrue("Addition test failed during Given steps.", calculatorSteps.additionTestGivenSteps());
//    assertTrue("Addition test failed during When steps.", calculatorSteps.additionTestWhenSteps());
//
//
//  }
}