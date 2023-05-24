interface ConsoleInterface {
  
  public String readString(String title);

	public int readInt(String title);

	public double readDouble(String title);

	public char readChar(String title);

	public void write(String string);

	public void write(int value);

	public void write(double value);

	public void write(char character);

	public void write(boolean character);

	public void writeln();

	public void writeln(String string);

	public void writeln(int value);

	public void writeln(double value);

	public void writeln(char value);

	public void writeln(boolean value);

}
