/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (double): ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número (double): ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado (decimal): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
    
}
