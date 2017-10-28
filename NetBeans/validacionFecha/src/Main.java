
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
        // TODO code application logic here
        //Validar fecha introduciendola como cadena que sea: dd-mm-aaaa
        Scanner teclado;
        String numero;
        teclado = new Scanner(System.in);
        boolean decision=true;
        
        System.out.println("Introduzca la fecha en formato dd-mm-aaaa, por favor: ");
        numero = teclado.nextLine();
        
        
        
        if(numero.length()==10){
            
            int comprobacionDias [] ={31,28,31,30,31,30,31,31,30,31,30,31};
            
            String dia=numero.substring(0, 2);
            int diaValido=Integer.parseInt(dia);
            String mes=numero.substring(3, 5);
            int mesValido=Integer.parseInt(mes);
            String year=numero.substring(6, 10);
            int yearValido=Integer.parseInt(year);
            String guion1=numero.substring(2, 3);
            String guion2=numero.substring(5, 6);

            if(diaValido<1 || diaValido>31){
                decision=false;
            }
            if(mesValido<1 || mesValido>12){
                decision=false;
            }else{
                if(diaValido<1 || diaValido>comprobacionDias[mesValido-1]){
                    decision=false;
                }
            }
            
            
            if(yearValido<0 || yearValido>3000){
                decision=false;
            }
            if(!guion1.equals("-")){
                decision=false;
            }
            if(!guion2.equals("-")){
                decision=false;
            }
            
            
            
            System.out.println("La fecha introducide es: "+decision);

        }else{
            System.out.println("Has introducido la fecha sin el formato requerido");
        }
        
        
    }
    
}
