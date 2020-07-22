package resources.calculator.apps;

import resources.SikuliApp;

public class CalculatorApp extends SikuliApp {
  public static SikuliApp calculatorApp;
  private String executableFileLocation = "c://Windows//System32//calc.exe";
  private String windowTitle = "Calculator";

  public CalculatorApp() {
    super();
    calculatorApp.openApp(this.executableFileLocation);
    calculatorApp.setWindowTitle(this.windowTitle);
  }


}
