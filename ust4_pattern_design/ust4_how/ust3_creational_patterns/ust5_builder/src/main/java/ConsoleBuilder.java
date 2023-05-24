class ConsoleBuilder {
  
  private ConsoleInterface first;

  public ConsoleBuilder() {
    this.first = null;
  }

  public ConsoleBuilder underliner(char underline) {
    this.insertLast(new UnderlinerConsole(underline));
    return this;
  }

  private void insertLast(ConsoleInterface console) {
    if (this.first != null) {
      ((DecoratorConsole) this.first).insertLast(console);
    } else {
      this.first = console;
    }
  }

  public ConsoleBuilder centerer(int width) {
    this.insertLast(new CenterConsole(width));
    return this;
  }

  public ConsoleInterface build() {
    this.insertLast(Console.instance()); 
    return this.first;
  }

}
