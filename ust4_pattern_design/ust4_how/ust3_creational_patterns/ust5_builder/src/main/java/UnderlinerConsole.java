class UnderlinerConsole extends DecoratorConsole {

  private char underline;

  public UnderlinerConsole(char underline) {
    this.underline = underline;
  }

  public void write(String string) {
    this.next.write(this.getUnderlines(string));
  }

  private String getUnderlines(String string) {
    String[] lines = string.split("\n");
    String spaces = "";
    for(int i=0; i<lines.length; i++){
      spaces += this.getUnderline(lines[i]) + "\n";
    }
    return spaces.substring(0, spaces.length()-1);
  }
  
  private String getUnderline(String string) {
    final int length = string.length();
    string += "\n";
    for(int i=0; i<length; i++){
      string += this.underline;
    }
    return string;
  }

  public void writeln(String string) {
    this.next.writeln(this.getUnderlines(string));
  }
  
}
