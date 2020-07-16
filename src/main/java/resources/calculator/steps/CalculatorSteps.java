package resources.calculator.steps;

import org.sikuli.script.SikuliException;
import resources.SikuliDesktop;
import resources.SikuliWindow;
import resources.calculator.pages.CalculatorPage;

public class CalculatorSteps {

  public SikuliWindow calculatorWindow = new SikuliWindow("calculator/images/ui/calculator_window.png","Calculator window, standard size");
  public CalculatorPage calculatorPage = new CalculatorPage();

  public boolean limitSearchToCalculatorWindow() {
    boolean isSearchRegionLimited = false;

    if(SikuliDesktop.FindElement(calculatorWindow.getWindow())) {
      try {
        SikuliDesktop.LimitSearchToWindow(calculatorWindow);
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