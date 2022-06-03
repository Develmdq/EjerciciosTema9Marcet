public class App {
    public static final String ANSI_RESET = "\u001B[0m";    
    public static final String ANSI_CYAN = "\u001B[36m";
    
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente();
        cliente.edad = 49;
        cliente.telefono = 123456789;
        cliente.nombre = "Eduardo Marcet";
        cliente.credito = 2500.50;
        System.out.println(ANSI_CYAN + "Cliente: " + ANSI_RESET + cliente.nombre + ANSI_CYAN
                + " Edad: " + ANSI_RESET + cliente.edad + " años" + ANSI_CYAN
                + " Tel: " + ANSI_RESET + cliente.telefono + ANSI_CYAN + " Crédito: " + ANSI_RESET + "$ " + cliente.credito + ANSI_RESET);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 50;
        trabajador.telefono = 111222333;
        trabajador.nombre = "Armando Mesas";
        trabajador.salario = 1500.50;
        System.out.println(ANSI_CYAN + "Trabajador: " + ANSI_RESET + trabajador.nombre + ANSI_CYAN
                + " Edad: " + ANSI_RESET + trabajador.edad + " años" + ANSI_CYAN
                + " Tel: " + ANSI_RESET + trabajador.telefono + ANSI_CYAN + " Crédito: " + ANSI_RESET + "$ "
                + trabajador.salario + ANSI_RESET);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
