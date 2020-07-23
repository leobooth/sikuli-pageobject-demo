package resources.calculator.steps;

import org.sikuli.script.SikuliException;
import resources.SikuliElement;
import resources.SikuliWindow;
import resources.SikuliPage;
import resources.calculator.pages.CalculatorPage;

public class CalculatorSteps {
  public CalculatorPage calculatorPage = new CalculatorPage();

  public boolean limitSearchToCalculatorWindow() {
    boolean isSearchRegionLimited = false;

    if (SikuliPage.FindElement(calculatorPage.getCalculatorWindow().getWindow())) {
      try {
        SikuliWindow.LimitSearchToWindow(calculatorPage.getCalculatorWindow());
        isSearchRegionLimited = true;
      } catch (SikuliException e) {
        isSearchRegionLimited = false;
      }
    }
    return isSearchRegionLimited;
  }

  public boolean additionTestGivenSteps() {
    boolean isSuccessful = false;

    try {
      System.out.println("GIVEN I press the '1', '+', and '2' buttons");
      calculatorPage.clickButton(1);
      calculatorPage.clickButton("+");
      calculatorPage.clickButton(2);
      isSuccessful = true;
    } catch (SikuliException e) {
      System.out.println(e.getMessage());
      isSuccessful = false;
    }

    return isSuccessful;
  }

  public boolean additionTestOcrGivenSteps() {
    System.out.println("GIVEN the calculator result display area contains '0'");
    String displayAreaText = calculatorPage.getTextFromDisplayArea();
    if(displayAreaText.equals("0")) {
      return true;
    } else {
      return false;
    }
  }

  public boolean additionTestWhenSteps() {
    boolean isSuccessful = false;

    try {
      System.out.println("WHEN I press the '=' button");
      calculatorPage.clickButton("=");
      isSuccessful = true;
    } catch (SikuliException e) {
      System.out.println(e.getMessage());
      isSuccessful = false;
    }

    return isSuccessful;
  }

  public boolean additionTestThenSteps() {
    SikuliElement additionTestOutcome = new SikuliElement(
        "calculator/images/assertions/display_shows_3.png",
        "1 + 2 = 3");
    return SikuliPage.FindElement(additionTestOutcome);
  }

  public boolean additionTestOcrThenSteps() {
    return false;
  }
}