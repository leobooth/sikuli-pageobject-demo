package resources;

import org.sikuli.script.Pattern;

public class SikuliElement {
  private String imagePath;
  private Pattern pattern;
  private String description;

  public SikuliElement(String imagePath) {
    this.pattern = new Pattern(imagePath).similar(SikuliSettings.MIN_SIMILARITY).targetOffset(0, 0);
    this.imagePath = imagePath;
    this.description = "";
  }

  public Pattern getPattern() {
    return this.pattern;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return this.description;
  }
}