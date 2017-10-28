/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicarn;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class TablaMultiplicarN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado;
        teclado = new Scanner(System.in);
        numero=teclado.nextInt();
        System.out.println("La tabla del "+numero +"es:");
        for (int j=0; j<=10; j++){
            int resultado=numero*j;
            System.out.println(numero+" * "+j+" = "+ resultado);
        }
    }
    
}
