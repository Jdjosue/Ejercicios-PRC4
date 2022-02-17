package ejercicio5.prc4;

import java.util.Scanner;

public class Ejercicio5PRC4 {

    public static void main(String[] args) {
        int numero, numeroMayor = 0, numeroMenor = 0, suma = 0, aumento, decremento;
        boolean dioDocientos = false;

        Scanner leer = new Scanner(System.in);

        for (int i = 4; i > 0; i--) {

            System.out.println("Digite el numero: ");
            numero = leer.nextInt();
            
            suma = suma + numero;
            if (suma >= 200) {
                System.out.println("El total de la suma de numeros fue 200 no se puede continuar :( digite todos los numeros de nuevo!");
                
                suma = 0;
               
                i = 5;
                numeroMayor = 0;
                numeroMenor = 0;
                
                dioDocientos = true;
            }

          
            if (!dioDocientos) {

                
                if (numero < 0) {
                    System.out.println("No se permiten valores negativos!");
                    System.out.println("Digite de nuevo el numero a ingresar: ");
                    numero = leer.nextInt();
                }

                
                if (numero > numeroMayor || numeroMayor == 0) {

                    
                    if (numeroMenor > 10) {
                        aumento = 10;
                    } else {
                        aumento = 0;
                    }
                    numeroMayor = numero + aumento;
                }

                if (numero < numeroMenor || numeroMenor == 0) {

                  
                    if (numeroMayor < 50 && i != 4) {
                        decremento = 5;
                    } else{
                        decremento = 0;
                    }

                    numeroMenor = numero - decremento;
                }
            }
            
            dioDocientos = false;
        }

        System.out.println("-------------RESULTADO FINAL---------------");
        System.out.println("Numero Mayor: " + numeroMayor);
        System.out.println("Numero Menor: " + numeroMenor);
    }

}
