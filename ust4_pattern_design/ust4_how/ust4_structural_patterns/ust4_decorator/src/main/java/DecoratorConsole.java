abstract class DecoratorConsole implements ConsoleInterface {
  
  protected ConsoleInterface next;

  protected DecoratorConsole(ConsoleInterface console){
    this.next = console;
  }

  public String readString(String title) {
    return this.next.readString(title);
  }

  public int readInt(String title) {
    return this.next.readInt(title);
  }

  public double readDouble(String title) {
    return this.next.readDouble(title);
  }

  public char readChar(String title) {
    return this.next.readChar(title);
  }

  public void write(int value) {
    this.write("" + value);
  }

  public void write(double value) {
    this.write("" + value);
  }

  public void write(char value) {
    this.write("" + value);
  }

  public void write(boolean value) {
    this.write("" + value);
  }

  public void writeln() {
    this.write("\n");
  }

  public void writeln(int value) {
    this.writeln("" + value);
  }

  public void writeln(double value) {
    this.writeln("" + value);
  }

  public void writeln(char value) {
    this.writeln("" + value);
  }

  public void writeln(boolean value) {
    this.writeln("" + value);
  }

}
