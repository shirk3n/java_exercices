
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
        Scanner teclado;
        String nombre;
        teclado = new Scanner(System.in);
        String masLarga = "";
        String masCorta = "";
        int longMasCorta=Integer.MAX_VALUE;
        String nombreArray[] = new String[100];
        int contadorPalabras=0;
        do{
            System.out.println("Introduce tu nombre: ");
            nombre = teclado.nextLine();
            
            System.out.println("La longitud del nombre es: "+nombre.length());
            
            if(!nombre.equals("fin")){
                nombreArray[contadorPalabras]=nombre;
                contadorPalabras++;
            }
            
            if(masLarga.length()<nombre.length()){
                masLarga=nombre;
            }
            if(longMasCorta > nombre.length()){
                longMasCorta = nombre.length();
                masCorta = nombre;
            }
            
            
        }while(!nombre.equals("fin"));
        int cont=0;
        int media=0;
        System.out.println("La palabra mas larga es: "+masLarga);
        System.out.println("La palabra mas corta es: "+masCorta);
        for(int j=0; j<contadorPalabras;j++){
            cont+=nombreArray[j].length();
        }
        media=cont/contadorPalabras;
        System.out.println("La media es: "+media);
        for(int i=0;i<contadorPalabras;i++){
            if(nombreArray[i].length()<media){
                System.out.println(nombreArray[i]+" no lo supera");
            }
        }
        for(int i=0;i<contadorPalabras;i++){
            if(nombreArray[i].length()>media){
                System.out.println(nombreArray[i]+" si lo supera");
            }
        }
        String palabraNueva ="";
        for(int i=0;i<contadorPalabras;i++){
            palabraNueva+=nombreArray[i].charAt(0);
        }
        System.out.println("La nueva palabra es: "+palabraNueva);
    }
    
}
