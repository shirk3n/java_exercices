/*
    Mostrar al usuario este menu:

Votar:
    1.- Partido A
    2.- Partido B
    3.- Partido C
    4.- Partido D
    0.- Terminar

    Se deben guardar los votos que recibe cada partido. Se debe, al terminar, sacar la media de votos, sacar el partido
    con más votos, el que menos votos tiene, los que están encima y los que están debajo de la media y el porcentaje
    de votos sobre el total que tiene cada partido asi como el total de votos entre todos los partidos.
 */
package votaciones;

import java.util.Scanner;

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
        int recuento[]= new int[]{0, 0, 0, 0};
        int votos=0;
        int mayor=Integer.MIN_VALUE;
        int menor=Integer.MAX_VALUE;
        
        int opcion;
        do{
            System.out.println("Elije a qué partido quieres votar: ");
            System.out.println("1.- Partido A\n" +
                                "    2.- Partido B\n" +
                                "    3.- Partido C\n" +
                                "    4.- Partido D\n" +
                                "    0.- Terminar");
            teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Has votado al partido A");
                    recuento[0]+=1;
                    votos++;
                    break;
                case 2:
                    System.out.println("Has votado al partido B");
                    recuento[1]+=1;
                    votos++;
                    break;
                case 3:
                    System.out.println("Has votado al partido C");
                    recuento[2]+=1;
                    votos++;
                    break;
                case 4:
                    System.out.println("Has votado al partido D");
                    recuento[3]+=1;
                    votos++;
                    break;
                case 0:
                    break;
                default:
                    break;
            }
            
        }while(opcion!=0);
        
        int media;
        media = votos/4;
        System.out.println("La media de todos los votos es: "+ media);
        int partidoMayor=0; //Tomamos esto como posicion no como valor
        int partidoMenor=0;
        for(int i=0; i<recuento.length;i++){
            if(recuento[i]>recuento[partidoMayor]){
                partidoMayor=i;
            }
            if(recuento[i]<recuento[partidoMenor]){
                partidoMenor=i;
            }
        }
        System.out.print("El partido que ha sacado mas votos ha sido: ");
        switch(partidoMayor){
            case 0:
                System.out.println("Partido A");
                break;
            case 1:
                System.out.println("Partido B");
                break;
            case 2:
                System.out.println("Partido C");
                break;
            case 3:
                System.out.println("Partido D");
                break;
        }
        System.out.print("El partido que ha sacado menos votos ha sido: ");
        switch(partidoMenor){
            case 0:
                System.out.println("Partido A");
                break;
            case 1:
                System.out.println("Partido B");
                break;
            case 2:
                System.out.println("Partido C");
                break;
            case 3:
                System.out.println("Partido D");
                break;
        }
        
        int porEncima;
        int porDebajo;
        for(int i=0; i<recuento.length;i++){
            if(recuento[i]>media){
                switch(partidoMenor){
                    case 0:
                        System.out.println("Partido A ha obtenido más votos que la media "+recuento[i]+"/"+media);
                        break;
                    case 1:
                        System.out.println("Partido B ha obtenido más votos que la media "+recuento[i]+"/"+media);
                        break;
                    case 2:
                        System.out.println("Partido C ha obtenido más votos que la media "+recuento[i]+"/"+media);
                        break;
                    case 3:
                        System.out.println("Partido D ha obtenido más votos que la media "+recuento[i]+"/"+media);
                        break;
                }
            }else if(recuento[i] < media){
                switch(partidoMenor){
                    case 0:
                        System.out.println("Partido A ha obtenido menos votos que la media "+recuento[i]+"/"+media);
                        break;
                    case 1:
                        System.out.println("Partido B ha obtenido menos votos que la media "+recuento[i]+"/"+media);
                        break;
                    case 2:
                        System.out.println("Partido C ha obtenido menos votos que la media "+recuento[i]+"/"+media);
                        break;
                    case 3:
                        System.out.println("Partido D ha obtenido menos votos que la media "+recuento[i]+"/"+media);
                        break;
                }
            }
        }
        
        
        }
    }   

