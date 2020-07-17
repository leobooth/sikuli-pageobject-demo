package resources;

import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

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

  //TODO: add functions to minimize, maximize, close window
  // may need to use WinAppDriver functions for these
}
