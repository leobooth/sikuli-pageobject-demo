package tests.calculator;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.sikuli.script.*;
import org.junit.*;
import resources.SikuliElement;
import resources.SikuliSettings;
import resources.calculator.pages.CalculatorPage;
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
    CalculatorPage calculatorPage = new CalculatorPage();
    boolean isOutcomeImageFound = false;

    assertTrue("Addition test failed during Given steps.", calculatorSteps.additionTestGivenSteps());
    assertTrue("Addition test failed during When steps.", calculatorSteps.additionTestWhenSteps());

    SikuliElement additionTestOutcome = new SikuliElement("calculator/images/tests/addition_test_outcome.png");
    isOutcomeImageFound = calculatorPage.findElement(additionTestOutcome);
    assertTrue("Test outcome image not found",isOutcomeImageFound);
  }
}