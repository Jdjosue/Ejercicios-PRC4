package ejercicio2.prc4;

import java.util.Scanner;

public class Ejercicio2PRC4 {

    public static void main(String[] args) {
        float compra, total;
        int bolita;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la suma total de la compra: ");
        compra = leer.nextFloat();
        System.out.println("Elija una de las opciones correspondiente roja=1, verde=2, blanca=3: ");
        bolita = leer.nextInt();
        
        switch (bolita) {
            case 1:
                total = (float) (compra - (compra * 0.10));
                System.out.println("Aplicando el debido descuento de 10%, su monto a pagar es de: " + total);
                System.out.println("Gracias por elegirnos");
                break;
            case 2:
                total = (float) (compra - (compra * 0.05));
                System.out.println("Aplicando el debido descuento de 5%, su monto a pagar es de: " + total);
                System.out.println("Gracias por elegirnos");
                break;
            default:
                System.out.println("No es elegible para el descuento, suerte en la próxima compra");
                break;
        }

    }

}
