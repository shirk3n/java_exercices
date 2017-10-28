/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosparesentren;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class NumerosParesEntreN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int inicio,limite;
        Scanner teclado;
        System.out.print("Introduce un inicio: ");
        teclado = new Scanner(System.in);
        inicio = teclado.nextInt();
        
        System.out.print("Introduce un límite: ");
        teclado = new Scanner(System.in);
        limite = teclado.nextInt();
       
        int acumulador=0;
        int media=0;
        int contador=0;
        int max=inicio;
        int min=limite;
        for(int valor = inicio; valor < limite; valor++){
            if(valor%2==0){
                System.out.println(valor);
                acumulador=acumulador+valor;
                contador++;
                if(valor<min){
                    min = valor;
                }
                if(valor>max){
                    max = valor;
                }
            }
        }
        System.out.println("Mayor "+max);
        System.out.println("Menor "+min);
        media=acumulador/contador;
        System.out.println("Suma "+acumulador);
        System.out.println("Media "+media);
    }
    
}
