/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

/**
 *
 * @author Juan
 */
public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.print("\n \n Tabla del "+i + "\n");
            for(int j=0;j<10; j++){
                int suma = i+j;
                System.out.print("\t" + i+" + "+j+" = "+ suma + "\n");
            }
        }// TODO code application logic here
    }
    
}