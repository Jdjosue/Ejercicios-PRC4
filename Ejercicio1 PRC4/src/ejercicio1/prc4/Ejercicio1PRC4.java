package ejercicio1.prc4;

import java.util.Scanner;

public class Ejercicio1PRC4 {

    public static void main1(String[] args) {

        float nota = (float) 0.00;

        Scanner leer = new Scanner(System.in);
        System.out.print("Digite la nota: ");

        nota = leer.nextFloat();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else if (nota >= 6.50 && nota <= 6.99) {
            System.out.println("Usted es elegible, ya que su nota es: " + nota);
        } else {
            System.out.println("Reprobado");
        }
    }

}
