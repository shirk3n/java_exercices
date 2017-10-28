
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
        Scanner teclado;
        String email;
        teclado = new Scanner(System.in);

        System.out.println("Introduzca su email: ");
        email = teclado.nextLine();
        //indexOf lastIndexOf
        if(email.indexOf("@") != -1 && email.indexOf("@") == email.lastIndexOf("@")){
            if(email.lastIndexOf("@")<email.lastIndexOf(".")){
                System.out.println("Verificacion de . correcta");
                if(email.substring(email.lastIndexOf("."), email.length()-1)=="com"){

                }
            }
            System.out.println("Verificacion de @ correcta");

        }else{
            System.out.println("No correcta");
        }
    }

}

