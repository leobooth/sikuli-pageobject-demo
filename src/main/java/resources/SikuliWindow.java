package resources;

import static resources.SikuliDesktop.DESKTOP;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.SikuliException;

// the window is the app window in which to locate images
// see: https://docs.microsoft.com/en-us/windows/win32/uxguide/visual-index
public class SikuliWindow extends Region {

  private SikuliElement window;

  // sections of a window image that may change during a test (such as version numbers) should be masked
  public SikuliWindow(String imagePath, String description, boolean isImageMasked) {
    Pattern pattern;
    if(isImageMasked) {
      pattern = new Pattern(imagePath).mask();
    } else {
      pattern = new Pattern(imagePath);
    }

    this.window = new SikuliElement(pattern, description);
  }

  public SikuliElement getWindow() {
    return this.window;
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

  //TODO: add functions to minimize, maximize, close window
  // may need to use WinAppDriver functions for these
}
