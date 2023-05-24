class App {

  public static void main(String[] args) {
    ConsoleInterface console;
    
    console = new ConsoleBuilder().build();
    console.writeln("Texto sin efectos");
    console.writeln("Texto\nsin efectos");
    
    console = new ConsoleBuilder()
                .centerer(40).build();
    console.writeln("Texto con centrado");
    console.writeln("Texto\ncon centrado");

    console = new ConsoleBuilder()
                .underliner('=')
                .centerer(40).build();
    console.writeln("Texto con centrado y subrayado");
    console.writeln("Texto\ncon centrado y subrayado");
    
    console = new ConsoleBuilder()
                .centerer(80)
                .underliner('-').build();
    console.writeln("Texto con centrado y subrayado");
    console.writeln("Texto\ncon centrado y subrayado");

  }

}
