package ejercicio3.prc4;

import java.util.Scanner;

public class Ejercicio3PRC4 {

    public static void main(String[] args) {
        int numeroEmpleados;
        
        double[] sueldos;
        
        double sueldoIngresado;
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados para agregar salario: ");
        numeroEmpleados = leer.nextInt();
        
        sueldos = new double[numeroEmpleados];

        
        for (int i = 0; i < numeroEmpleados; i++) {
            
            System.out.println("Ingrese salario del empleado " + (i + 1) + ": ");
            
            sueldoIngresado = leer.nextDouble();
            
           
            if (sueldoIngresado < 0) {
                
                do {
                    System.out.println("No se admiten cantidades negativas, ingrese de nuevo el salario: ");
                    sueldoIngresado = leer.nextDouble();
                } while (sueldoIngresado < 0);
            }
            
            sueldos[i] = sueldoIngresado;
        }

        int contador = 1;
        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("salario del empleado " + contador + ": " + sueldos[i]);
        }
    }

}
