/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfrutas;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ArrayFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fruta[] = new String[100];
        int contador=0;
        
        Scanner teclado;
        int opcion;
        do{
            System.out.println("Menú principal\n"
                    + "1.- Nueva fruta\n"
                    + "2.- Ver fruta\n"
                    +"0.- Salir\n");
            
            System.out.println("Introduzca la opción que desea: ");
            teclado = new Scanner(System.in);
            
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Nombre de la fruta");
                    String nombre;
                    teclado = new Scanner(System.in);
                    nombre = teclado.nextLine();
                    
                    fruta[contador]=nombre;
                    contador++;
                    break;
                case 2:
                    System.out.println("Las frutas son: ");
                    for(int i=0; i<contador; i++){
                        System.out.println(fruta[i]);
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
