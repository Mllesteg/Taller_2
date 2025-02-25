package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opa = "piedra";
        String opb = "papel";
        String opc = "tijeras";

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int victoriasconor = 0;
        int victoriasyarbis = 0;
        while (victoriasconor < 2 && victoriasyarbis < 2) {
            System.out.println("Elige una opción:");
            System.out.println("1. " + opa);
            System.out.println("2. " + opb);
            System.out.println("3. " + opc);

            int opcion = scanner.nextInt();
            System.out.println(opcion);


            int yarbis = random.nextInt(3) + 1;
            System.out.println(yarbis);

            if (opcion == yarbis) {
                System.out.println("Tablas");
            } else if ((opcion == 1 && yarbis == 3) ||
                    (opcion == 2 && yarbis == 1) ||
                    (opcion == 3 && yarbis == 2)) {
                System.out.println("Perdio yarbis");
            } else {
                System.out.println("Ganó yarbis");
            }
        }
    }
}










