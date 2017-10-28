/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuopcion;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class MenuOpcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado;
        int opcion;
        int numero1,numero2,resultado;
        
        do{
            System.out.println("Menú principal\n"
                    + "1.- Suma\n"
                    + "2.- Resta\n"
                    + "3.- Multiplicación\n"
                    + "4.- División\n"
                    +"0.- Salir\n");
            System.out.println("Introduzca la opción que desea: ");
            teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduce el primer numero a sumar y presiona enter");
                    numero1 = teclado.nextInt();
                    System.out.println("Introduce el segundo numero a sumar y presiona enter");
                    numero2 = teclado.nextInt();
                    resultado=numero1+numero2;
                    System.out.println("La suma es "+resultado);
                    break;
                case 2:
                    System.out.println("Introduce el segundo numero a restar y presiona enter");
                    numero1 = teclado.nextInt();
                    System.out.println("Introduce el segundo numero a restar y presiona enter");
                    numero2 = teclado.nextInt();
                    resultado=numero1-numero2;
                    System.out.println("La resta es "+resultado);
                    break;
                case 3:
                    System.out.println("Introduce el primer numero a multiplicar y presiona enter");
                    numero1 = teclado.nextInt();
                    System.out.println("Introduce el segundo numero a multiplicar y presiona enter");
                    numero2 = teclado.nextInt();
                    resultado=numero1*numero2;
                    System.out.println("La multiplicación es "+resultado);
                    break;
                case 4:
                    System.out.println("Introduce el dividendo y presiona enter");
                    numero1 = teclado.nextInt();
                    System.out.println("Introduce el divisor y presiona enter");
                    numero2 = teclado.nextInt();
                    if(numero2==0){
                        System.out.println("No se puede dividir por 0");
                    }else{
                        resultado=numero1/numero2;
                        System.out.println("La división es "+resultado);
                    }
                    
                    break;
                case 0:
                    break;
                default:
                    break;
            }
                    
        }while(opcion != 0);
       
          
    }
    
}
