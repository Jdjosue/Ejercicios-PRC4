package ejercicio4.prc4;


import java.util.Scanner;

public class Ejercicio4PRC4 {

    public static void main(String[] args) {
        int cantidadNumeros, numeroMayor = 0, numeroMenor = 0, cantidadPares = 0, numero;

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Que cantidad de numeros ingerasará? digite la cantidad: ");
        cantidadNumeros = leer.nextInt();
        
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Digite el numero: ");
            numero = leer.nextInt();

         
            if (numero < 0) {
                System.out.println("No se permiten valores negativos!");
                return;
            }

            
            if (numero > numeroMayor || numeroMayor == 0) {
                numeroMayor = numero;
            }

            if (numero < numeroMenor || numeroMenor == 0) {
                numeroMenor = numero;
            }
            
           
            if (numero % 2 == 0) {
                
                cantidadPares++;
            }
        }
        
        System.out.println("Numero Mayor: " + numeroMayor);
        System.out.println("Numero Menor: " + numeroMenor);
        System.out.println("Numero Cantidad Pares: " + cantidadPares);

    }

}
