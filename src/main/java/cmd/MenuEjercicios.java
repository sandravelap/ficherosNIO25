package cmd;

import java.util.Scanner;

import static java.lang.IO.println;

public class MenuEjercicios {

    private Scanner scanner = new Scanner(System.in);
    private boolean salir = false;

    public void muestraMenu(){
        String opcion;
        do {
            System.out.println("Elige una opcion:");
            System.out.println("1. Listar ficheros");
            System.out.println("2. Sin implementar");
            System.out.println("0. Salir");
            opcion = this.pideOpcion();
            this.procesaOpcion(opcion);
        } while (!salir);
    }

    private String pideOpcion() {
        return this.scanner.nextLine();
    }

    private void procesaOpcion(String opcion) {
        switch (opcion) {
            case "0" -> salir = true;
            case "1" -> println("Listar ficheros");
            case "2" -> println("Sin implementar");
            default -> System.out.println("Opcion no valida");
        }
    }
}
