package resources;

import org.sikuli.script.App;

public class SikuliApp extends App {

  public enum APP_ACTION {OPEN, FOCUS}

  private App app;
  private String executableFileLocation;
  private String windowTitle;

  public SikuliApp() {
    this.app = new App();
    this.executableFileLocation = "";
    this.windowTitle = "";
  }

  public SikuliApp(String executableFileLocation, String windowTitle) {
    this.app = App.open(executableFileLocation);
    this.executableFileLocation = executableFileLocation;
    this.windowTitle = windowTitle;
  }

  public SikuliApp(APP_ACTION action, String appLocator) {
    if(action == APP_ACTION.OPEN) {
      this.app = App.open(appLocator);
      this.executableFileLocation = appLocator;
      this.windowTitle = "";
    } else if (action == APP_ACTION.FOCUS) {
      this.app = App.focus(appLocator);
      this.executableFileLocation = "";
      this.windowTitle = appLocator;
    }
  }

  public void openApp(String executableFileLocation) {
    this.app = App.open(executableFileLocation);
    this.executableFileLocation = executableFileLocation;
    this.windowTitle = "";
  }

  // assumes window title is unique
  public void focusApp(String windowTitle) {
    this.app = App.focus(windowTitle);
    this.windowTitle = windowTitle;
  }

  public void setWindowTitle(String windowTitle) {
    this.windowTitle = windowTitle;
  }
}