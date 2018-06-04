package code;

public enum Size {
SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
  private Size(String abs) {
    this.abs=abs;
  }
  private String abs;
  public String getabs() {
    return this.abs;
  } 
}
