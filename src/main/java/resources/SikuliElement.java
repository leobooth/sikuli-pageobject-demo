package resources;

import org.sikuli.script.Pattern;

public class SikuliElement {
  private String imagePath;
  private Pattern pattern;
  private String description;

  public SikuliElement(String imagePath, String description) {
    this.imagePath = imagePath;
    this.pattern = new Pattern(imagePath).similar(SikuliSettings.MIN_SIMILARITY).targetOffset(0, 0);
    this.description = "";
  }

  public SikuliElement(Pattern pattern, String description) {
    this.imagePath = pattern.getFilename();
    this.pattern = pattern;
    this.description = description;
  }

  public String getImagePath() {
    return this.imagePath;
  }

  public Pattern getPattern() {
    return this.pattern;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}