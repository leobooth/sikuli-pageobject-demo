package tests.calculator;

import static org.junit.Assert.assertTrue;
import static resources.SikuliDesktop.FindElement;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.sikuli.script.*;
import org.junit.*;
import resources.SikuliElement;
import resources.SikuliSettings;
import resources.calculator.steps.CalculatorSteps;

@RunWith(JUnit4.class)
public class additionTest {

  // TODO: call page methods from Cucumber step definitions
  // TODO: convert project to JUnit 5 or TestNG to get more test setup methods and assertions?
  private static App calculatorApp;

  @BeforeClass
  public static void setupAdditionTest() {
    calculatorApp = App.open("c://Windows//System32//calc.exe");
  }

  @AfterClass
  public static void teardownAdditionTest() {
    calculatorApp.close();
  }

  @Test
  public void testAddition() {
    ImagePath.setBundlePath(SikuliSettings.BASE_IMAGEPATH);
    CalculatorSteps calculatorSteps = new CalculatorSteps();
    boolean isOutcomeImageFound = false;

    assertTrue("Unable to limit search to Calculator window", calculatorSteps.limitSearchToCalculatorWindow());
    assertTrue("Addition test failed during Given steps.", calculatorSteps.additionTestGivenSteps());
    assertTrue("Addition test failed during When steps.", calculatorSteps.additionTestWhenSteps());

    SikuliElement additionTestOutcome = new SikuliElement("calculator/images/tests/addition_test_outcome.png", "1 + 2 = 3");
    isOutcomeImageFound = FindElement(additionTestOutcome);
    assertTrue("Test outcome image not found",isOutcomeImageFound);
  }
}