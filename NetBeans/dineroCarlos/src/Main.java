
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
        teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dinero: ");
        dinero = teclado.nextInt();
        //Declarar una variable contador por cada valor de billete o moneda 
        int cont_500=0;
        int cont_200=0;
        int cont_100=0;
        int cont_50=0;
        int cont_20=0;
        int cont_10=0;
        int cont_5=0;
        int cont_2=0;
        int cont_1=0;
        //Abrir un while, mientras importe sea mayor que cero
        while(dinero>0){
            //Hacer un if por cada billete o moneda con esto: importe - billete >= 0 como condición y 
            //si entra, reduce en el valor del billete el importe y suma uno al contador correspondiente
            if(dinero-500>=0){
                dinero-=500;
                cont_500++;
            }
            else if(dinero-200>=0){
                dinero-=200;
                cont_200++;
            }
            else if(dinero-100>=0){
                dinero-=100;
                cont_100++;
            }
            else if(dinero-50>=0){
                dinero-=50;
                cont_50++;
            }
            else if(dinero-20>=0){
                dinero-=20;
                cont_20++;
            }
            else if(dinero-10>=0){
                dinero-=10;
                cont_10++;
            }
            else if(dinero-5>=0){
                dinero-=5;
                cont_5++;
            }
            else if(dinero-2>=0){
                dinero-=2;
                cont_2++;
            }
            else if(dinero-1>=0){
                dinero-=1;
                cont_1++;
            }
        }
        System.out.println("Billetes de 500: "+cont_500+"\n"+
                "Billetes de 200: "+cont_200+"\n"+
                "Billetes de 100: "+cont_100+"\n"+
                "Billetes de 50: "+cont_50+"\n"+
                "Billetes de 20: "+cont_20+"\n"+
                "Billetes de 10: "+cont_10+"\n"+
                "Billetes de 5: "+cont_5+"\n"+
                "Billetes de 2: "+cont_2+"\n"+
                "Billetes de 1: "+cont_1);
            
    }
    
}
