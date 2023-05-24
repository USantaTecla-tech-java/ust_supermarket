class App {

  public static void main(String[] args) {
    ConsoleInterface console;
    
    console = Console.instance();
    console.writeln("Texto sin efectos");
    console.writeln("Texto\nsin efectos");
    
    console = new CenterConsole(40, 
                Console.instance());
    console.writeln("Texto con centrado");
    console.writeln("Texto\ncon centrado");

    console = new UnderlinerConsole('=', 
                new CenterConsole(40, 
                  Console.instance()));
    console.writeln("Texto con centrado y subrayado");
    console.writeln("Texto\ncon centrado y subrayado");
    
    console = new CenterConsole(80, 
                new UnderlinerConsole('-', 
                  Console.instance()));
    console.writeln("Texto con centrado y subrayado");
    console.writeln("Texto\ncon centrado y subrayado");

  }

}
