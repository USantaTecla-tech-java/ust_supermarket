class CenterConsole extends DecoratorConsole  {

  private int width;

  public CenterConsole(int width) {
    this.width = width;
  }

  public void write(String string) {
    this.next.write(this.getCenteredLines(string));
  }

  private String getCenteredLines(String string) {
    String[] lines = string.split("\n");
    String spaces = "";
    for(int i=0; i<lines.length; i++){
      spaces += this.getCenteredLine(lines[i]) + "\n";
    }
    return spaces.substring(0, spaces.length()-1);
  }

  private String getCenteredLine(String string) {
    assert !string.contains("\n");

    int leftMargin = (this.width - string.length()) / 2; 
    for(int i=0; i<leftMargin; i++){
      string = " " + string;
    }
    return string;
  }

  public void writeln(String string) {
    this.next.writeln(this.getCenteredLines(string));
  }

}
