package resources;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class SikuliDesktop {

  /* TODO: support multiple monitors
     - loop through screens to find monitor containing App
     - set DESKTOP to monitor containing App
  */

  // in Sikuli, the Screen class represents the computer monitor(s)
  public static Screen DESKTOP = new Screen();

  public static boolean FindElement(SikuliElement sikuliElement) {
    boolean isFound = false;
    Match match;

    try {
      match = DESKTOP.find(sikuliElement.getPattern());
      isFound = true;
    } catch (SikuliException e) {
      isFound = false;
    }

    return isFound;
  }

  public static void LimitSearchToWindow(SikuliWindow window) throws SikuliException {
    Match match;

    try {
      match = DESKTOP.find(window.getWindow().getPattern());
      DESKTOP.setROI(match.getX(),match.getY(),match.getW(),match.getH());
    } catch (FindFailed e) {
      throw new SikuliException("Could not find window " + window.getWindow().getDescription());
    }
  }
}
