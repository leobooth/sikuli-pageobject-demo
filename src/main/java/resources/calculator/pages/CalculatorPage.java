package resources.calculator.pages;

import org.sikuli.script.SikuliException;
import resources.SikuliElement;
import resources.SikuliPage;

import static resources.SikuliDesktop.DESKTOP;
import static resources.SikuliDesktop.FindElement;

public class CalculatorPage extends SikuliPage {

  SikuliElement displayArea = new SikuliElement ("calculator/images/ui/display_area.png", "display area");
  SikuliElement button1 = new SikuliElement("calculator/images/ui/button_1.png", "button 1");
  SikuliElement button2 = new SikuliElement("calculator/images/ui/button_2.png", "button 2");
  SikuliElement buttonPlus = new SikuliElement("calculator/images/ui/button_plus.png", "plus button");
  SikuliElement buttonEquals = new SikuliElement("calculator/images/ui/button_equals.png", "equals button");

  private SikuliElement getButton(int numberButton) throws SikuliException {
    return getButton(Integer.toString(numberButton));
  }

  private SikuliElement getButton(String button) throws SikuliException {
    String buttonCase = button.trim().toUpperCase();
    SikuliElement buttonPath;

    switch (buttonCase) {
      case "1":
        buttonPath = button1;
        break;
      case "2":
        buttonPath = button2;
        break;
      case "+":
        buttonPath = buttonPlus;
        break;
      case "=":
        buttonPath = buttonEquals;
        break;
      default:
        throw new SikuliException("Invalid button requested: " + button);
    }

    return buttonPath;
  }

  public void clickButton(int numberButton) throws SikuliException {
    clickButton(Integer.toString(numberButton));
  }

  public void clickButton(String button) throws SikuliException {
    clickElement(getButton(button));
    System.out.println("clicked calculator button " + button);
  }

  public String getDisplayText() {
    FindElement(displayArea)
  }
}
