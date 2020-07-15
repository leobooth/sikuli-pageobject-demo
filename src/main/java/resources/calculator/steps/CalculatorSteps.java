package resources.calculator.steps;

import org.sikuli.script.SikuliException;
import resources.calculator.pages.CalculatorPage;

public class CalculatorSteps {

  public CalculatorPage calculatorPage = new CalculatorPage();

  public boolean additionTestGivenSteps() {
    boolean isSuccessful = false;

    try {
      System.out.println("GIVEN I press the '1', '+', and '2' buttons");
      calculatorPage.clickButton(1);
      calculatorPage.clickButton("+");
      calculatorPage.clickButton(2);
      isSuccessful = true;
    } catch (SikuliException e) {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  public boolean additionTestWhenSteps() {
    boolean isSuccessful = false;

    try {
      System.out.println("WHEN I press the '=' button");
      calculatorPage.clickButton("=");
      isSuccessful = true;
    } catch (SikuliException e) {
      isSuccessful = false;
    }

    return isSuccessful;
  }

}