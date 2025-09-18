package libs;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.IO.println;

public class UserMethods {
    public static Integer pedirEntero(String mensaje){
        boolean enteroOk = false;
        Integer entero = 0;
        Scanner sc = new Scanner(System.in);
        println(mensaje);
        while(!enteroOk) {
            try {
                entero = sc.nextInt();
                enteroOk = true;
            } catch (InputMismatchException e) {
                println("El entero es incorrecto. \nIntroduce un número entero válido:");
                sc = null;
                sc = new Scanner(System.in);
            }
        }
        return entero;
    }
}
