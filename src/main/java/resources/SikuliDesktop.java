package resources;

import org.sikuli.script.Screen;

public class SikuliDesktop {

  /* TODO: support multiple monitors
     - loop through screens to find monitor containing App
     - set DESKTOP to monitor containing App
  */

  // in Sikuli, the Screen class represents the computer monitor(s)
  public static Screen DESKTOP = new Screen();
}