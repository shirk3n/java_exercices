/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorconfor;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class MayorConFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado;
        teclado = new Scanner(System.in);
        int numero;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        System.out.println("Introduce 10 números: ");
        for(int i=0; i<=9; i++){
            numero = teclado.nextInt();
            if(numero>mayor){
                mayor = numero;
            }
            if (numero<menor){
                menor=numero;
            }
            
        }
        int diferencia=mayor-menor;
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
        System.out.println("La diferencia es: "+diferencia);
    }
    
}

/*



    Menú principal
    1.- Suma
    2.- Resta
    3.- Multiplicación
    4.- División
    0.- Salir
    Opción:


*/