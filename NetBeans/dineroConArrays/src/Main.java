
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pedir importe al usuario
        Scanner teclado;
        int dinero;
        int tipoDinero[] = {500,200,100,50,20,10,5,2,1};
        int contadorDinero [] = {0,0,0,0,0,0,0,0,0};
        do{
        teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dinero: ");
        dinero = teclado.nextInt();
        if(dinero<0){
            System.out.println("Por favor, introduzca un valor positivo ");
        }
        }while(dinero < 0);
        while(dinero > 0){
            for(int i=0; i<tipoDinero.length;i++){
                if(dinero-tipoDinero[i]>=0){
                    dinero-=tipoDinero[i];
                    contadorDinero[i]++;
                    break;
                }
                 
            }
            
        }
        
        for(int i = 0; i < tipoDinero.length; i++){
            if(contadorDinero[i] > 0){
                System.out.println("Recibes "+contadorDinero[i]+" de "+tipoDinero[i]+"€");
            }
        }
        
    }
    
}
