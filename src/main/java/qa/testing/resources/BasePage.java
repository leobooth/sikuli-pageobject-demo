package qa.testing.resources;

import org.sikuli.script.*;

public abstract class BasePage {

  // TODO: setup, teardown Screen in @Before and @After methods?
  // TODO: convert project to JUnit 5 to get more test setup methods?
  public static Screen screen = new Screen();

  protected static String BASE_IMAGEPATH = "D:/SideProjects/sikuli-practice/sikuli-practice/src/main/java/qa/testing/resources/images/";

  public BasePage() {
    ImagePath.setBundlePath(BASE_IMAGEPATH);
  }

  protected void click(String imagePath) throws SikuliException {
    try {
        screen.click(imagePath);
    } catch (Exception e) {
        throw new SikuliException("unable to click element represented by image: " + imagePath);
    }
  }
}
