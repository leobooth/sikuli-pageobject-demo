package qa.testing.resources.pages.calculator;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.SikuliException;
import qa.testing.resources.BasePage;

public class CalculatorPage extends BasePage {

  // TODO: create an ImageElement class with locatorImage and description properties
  private String button1 = "calculator/ui/button_1.png";
  private String button2 = "calculator/ui/button_2.png";
  private String buttonPlus = "calculator/ui/button_plus.png";
  private String buttonEquals = "calculator/ui/button_equals.png";

  public String getButtonPath(int button) throws SikuliException {
    return getButtonPath(Integer.toString(button));
  }

  public String getButtonPath(String button) throws SikuliException {
    String buttonCase = button.trim().toUpperCase();
    String buttonPath = "";

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

  public void click(int button) throws SikuliException {
    click(Integer.toString(button));
  }

  public void click(String button) throws SikuliException {
    super.click(getButtonPath(button));
    System.out.println("clicked calculator button " + button);
  }

}
