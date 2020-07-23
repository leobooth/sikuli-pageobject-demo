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
}
