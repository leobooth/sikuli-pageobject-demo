package resources;

import static resources.SikuliDesktop.DESKTOP;

import org.sikuli.script.*;

// in Sikuli, the Region class is similar to a PageObject;
public abstract class SikuliPage extends Region {

//  // in Sikuli, the Screen class represents the computer monitor(s)
//  public static Screen screen = new Screen();

  protected void clickElement(SikuliElement sikuliElement) throws SikuliException {
    int clicksPerformed = 0;
    clicksPerformed = DESKTOP.click(sikuliElement.getPattern());

    if(clicksPerformed == 0) {
      throw new SikuliException("unable to click element represented by image: " + sikuliElement.getPattern().getFilename());
    }
  }

  public static boolean FindElement(SikuliElement sikuliElement) {
    Match match;

    try {
      match = DESKTOP.find(sikuliElement.getPattern());
      return true;
    } catch (SikuliException e) {
      return false;
    }
  }

  protected String getText(SikuliElement sikuliElement) {
    String textFromRegion;
    try {
      Match match = DESKTOP.find(sikuliElement.getPattern());
      System.out.println(match.getScore());
      textFromRegion = match.getText();
      return textFromRegion;
    } catch (SikuliException e) {
      return "";
    }
  }
}