/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymenu;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ArrayMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vecinos[] = new String[100];
        int total_vecinos = 0;
        
        Scanner teclado;
        int opcion;
        do{
            System.out.println("Menú principal\n"
                    + "1.- Nuevo vecino\n"
                    + "2.- Ver vecinos\n"
                    +"0.- Salir\n");
            
            System.out.println("Introduzca la opción que desea: ");
            teclado = new Scanner(System.in);
            
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Añadir vecinos");
                    String nombre;
                    System.out.print("Nombre: ");
                    teclado = new Scanner(System.in);
                    nombre = teclado.nextLine();
                    
                    vecinos[total_vecinos] = nombre;
                    total_vecinos++;
                    break;
                case 2:
                    System.out.println("Ver vecinos");
                    for(int i = 0; i < total_vecinos; i++){
                        System.out.println("> "+vecinos[i]);
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
