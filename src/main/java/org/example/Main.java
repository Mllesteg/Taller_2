package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int monedas20 = 0;
        int monedas50 = 0;
        int monedas100 = 0;
        int monedas200 = 0;
        int monedas500 = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n--- Menú de la Alcancía ---");
            System.out.println("1. Agregar moneda");
            System.out.println("2. Ver cantidad de monedas");
            System.out.println("3. Calcular total ahorrado");
            System.out.println("4. Vaciar la alcancía");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Ingrese la denominación de la moneda (20, 50, 100, 200, 500): ");
                    int denominacion = scanner.nextInt();
                    switch (denominacion) {
                        case 20:
                            monedas20++;
                            System.out.println("Moneda de $20 agregada.");
                            break;
                        case 50:
                            monedas50++;
                            System.out.println("Moneda de $50 agregada.");
                            break;
                        case 100:
                            monedas100++;
                            System.out.println("Moneda de $100 agregada.");
                            break;
                        case 200:
                            monedas200++;
                            System.out.println("Moneda de $200 agregada.");
                            break;
                        case 500:
                            monedas500++;
                            System.out.println("Moneda de $500 agregada.");
                            break;
                        default:
                            System.out.println("Denominación no válida.");
                            break;
                    }
                    break;

                case 2:
                    // Ver cantidad de monedas
                    System.out.println("\nCantidad de monedas en la alcancía:");
                    System.out.println("$20: " + monedas20 + " monedas");
                    System.out.println("$50: " + monedas50 + " monedas");
                    System.out.println("$100: " + monedas100 + " monedas");
                    System.out.println("$200: " + monedas200 + " monedas");
                    System.out.println("$500: " + monedas500 + " monedas");
                    break;

                case 3:
                    // Calcular total ahorrado
                    int total = (monedas20 * 20) + (monedas50 * 50) + (monedas100 * 100) + (monedas200 * 200) + (monedas500 * 500);
                    System.out.println("Total ahorrado: $" + total);
                    break;

                case 4:
                    // Vaciar la alcancía
                    monedas20 = 0;
                    monedas50 = 0;
                    monedas100 = 0;
                    monedas200 = 0;
                    monedas500 = 0;
                    System.out.println("La alcancía ha sido vaciada.");
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}










