/*
Ejercicio 6: Hacer un programa
que tome dos números y diga si
ambos son pares o impares.
*/
package ambosparimpar;

import java.util.Scanner;

public class AmbosParImpar {


    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1,num2=0;
    
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el primer numero: ");
        num2 = teclado.nextInt();
    
    if (num1 % 2 == 0 && num2 % 2 == 0 ){
        System.out.println("los numeros son pares");
    }
    else {
        System.out.println("los numeros no son pares");
    }
    }
        
    
}
