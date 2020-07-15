package resources;

import org.sikuli.script.*;

// in Sikuli, the Region class is similar to a PageObject;
public abstract class SikuliPage extends Region {

  // in Sikuli, the Screen class represents the computer monitor(s)
  public static Screen screen = new Screen();

  protected void clickElement(SikuliElement sikuliElement) throws SikuliException {
    int clicksPerformed = 0;
    clicksPerformed = screen.click(sikuliElement.getPattern());

    if(clicksPerformed == 0) {
      throw new SikuliException("unable to click element represented by image: " + sikuliElement.getPattern().getFilename());
    }
  }

  protected boolean findElement(SikuliElement sikuliElement) {
    boolean isFound = false;
    Match match;

    try {
      match = screen.find(sikuliElement.getPattern());
      isFound = true;
    } catch (SikuliException e) {
      isFound = false;
    }

    return isFound;
  }
}
