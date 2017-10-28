/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedirnumero;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class PedirNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado;
        int numero;
        System.out.println("Escriba un numero");
        teclado = new Scanner(System.in);
        numero = teclado.nextInt();
        if (numero > 0){
            System.out.println("El numero "+numero+" es positivo");
        }else if(numero < 0){
            System.out.println("El numero "+numero+" es negativo");            
        }else{
            System.out.println("El numero es "+numero);
        }
    } 
}
