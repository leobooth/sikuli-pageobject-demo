package resources;

import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

// the window is the app window in which to locate images
// the sections of the actual window that can change should be masked
// (image sections outside the window frame should be covered with black pixels)
// see: https://docs.microsoft.com/en-us/windows/win32/uxguide/visual-index
public class SikuliWindow extends Region {

  private SikuliElement window;

  public SikuliWindow(String windowFrameImagePath, String description) {
    Pattern maskedPattern = new Pattern(windowFrameImagePath).mask();
    this.window = new SikuliElement(maskedPattern, description);
  }

  public SikuliElement getWindow() {
    return this.window;
  }
}
