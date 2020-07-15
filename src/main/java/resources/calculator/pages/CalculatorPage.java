package resources.calculator.pages;

import org.sikuli.script.SikuliException;
import resources.SikuliElement;
import resources.SikuliPage;

public class CalculatorPage extends SikuliPage {

  SikuliElement button1 = new SikuliElement("calculator/images/ui/button_1.png");
  SikuliElement button2 = new SikuliElement("calculator/images/ui/button_2.png");
  SikuliElement buttonPlus = new SikuliElement("calculator/images/ui/button_plus.png");
  SikuliElement buttonEquals = new SikuliElement("calculator/images/ui/button_equals.png");

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

  public boolean findElement(SikuliElement sikuliElement) {
    return super.findElement(sikuliElement);
  }
}
