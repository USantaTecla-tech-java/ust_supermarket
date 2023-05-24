import java.io.BufferedReader;
import java.io.InputStreamReader;

class Console implements ConsoleInterface {

	private static Console instance;

	public static Console instance() {
		if (Console.instance == null) {
			Console.instance = new Console();
		}
		return Console.instance;
	}

	private Console() {
	}

	private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public String readString(String title) {
		String input = null;
		this.write(title);
		try {
			input = this.bufferedReader.readLine();
		} catch (Exception ex) {
		}
		return input;
	}

	public int readInt(String title) {
		int input = 0;
		boolean ok = false;
		do {
			try {
				input = Integer.parseInt(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("integer");
			}
		} while (!ok);
		return input;
	}

	public double readDouble(String title) {
		double input = 0;
		boolean ok = false;
		do {
			try {
				input = Double.parseDouble(this.readString(title));
				ok = true;
			} catch (Exception ex) {
				this.writeError("integer");
			}
		} while (!ok);
		return input;
	}

	public char readChar(String title) {
		char charValue = ' ';
		boolean ok = false;
		do {
			String input = this.readString(title);
			if (input.length() != 1) {
				this.writeError("character");
			} else {
				charValue = input.charAt(0);
				ok = true;
			}
		} while (!ok);
		return charValue;
	}

	public void write(String value) {
		System.out.print(value);
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

	public void writeln(String value) {
		this.write(value + "\n");
	}

	public void writeln(int value) {
		this.write(value + "\n");
	}

	public void writeln(double value) {
		this.write(value + "\n");
	}

	public void writeln(char value) {
		this.write(value + "\n");
	}

	public void writeln(boolean value) {
		this.write(value + "\n");
	}

	private void writeError(String format) {
		this.write("FORMAT ERROR! Enter a " + format + " formatted value.");
		this.writeln();
	}

}
