package qa.testing.windows.calculator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.sikuli.script.*;
import org.junit.*;
import qa.testing.resources.pages.calculator.CalculatorPage;

@RunWith(JUnit4.class)
public class additionTest {

  // TODO: call page methods from Cucumber step definitions
  public CalculatorPage calculator = new CalculatorPage();

  @Test
  public void testAddition() {

    boolean isOutcomeImageFound = false;

    try {
      calculator.click(1);
      calculator.click("+");
      calculator.click(2);
      calculator.click("=");
    } catch (SikuliException e) {
      fail("Addition test failed during test setup.\n"
          + "Reason: " + e.getMessage());
    }

    try {
      // TODO: create BasePage version of screen.find() that returns a boolean
      // TODO: BasePage find() should accept an ImageElement so that it can get a nice description from elements in any test
      // TODO: create an ImageElement class with locatorImage and description properties
      calculator.screen.find("calculator/tests/addition_test_outcome.png");
      isOutcomeImageFound = true;
    } catch (FindFailed e) {
      isOutcomeImageFound = false;
    } finally {
      assertTrue(isOutcomeImageFound);
    }

    if(isOutcomeImageFound) {
      System.out.println("Addition test passed");
    } else {
      System.out.println("Addition test failed");
    }
  }
}