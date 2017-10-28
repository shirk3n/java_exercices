
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
        //Función que recibe una cadena y valide que tenga 9 dígitos
        Scanner teclado;
        String numero;
        teclado = new Scanner(System.in);
        System.out.println("Introduzca su DNI, por favor: ");
        numero = teclado.nextLine();
        
        

        
        
        System.out.println("El DNI es: "+validarDNI(numero));
        
    }
    
    public static boolean validarDNI(String dni){
        char letraDNI[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        boolean decision=true;
        for(int i=0;i<dni.length()-1;i++){
            if(dni.charAt(i)<'0' || dni.charAt(i)>'9'){
                decision=false;
            }
        }
        if(dni.charAt(dni.length()-1) < 'A' || dni.charAt(dni.length()-1) > 'Z') {
            decision = false;
        }
        
        String numeroSinLetra=dni.substring(0, 8);
        int modulo=Integer.parseInt(numeroSinLetra)%23;
        if(dni.charAt(dni.length()-1) != letraDNI[modulo]){
            decision=false;
        }

        
        return decision;
    }
    
}
