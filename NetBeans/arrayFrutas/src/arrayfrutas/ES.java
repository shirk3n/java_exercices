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
public class ES {
    public static int leeInt(){
        int valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                valor = teclado.nextInt();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static int leeInt(String mensaje){
        int valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextInt();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static int leeInt(String mensaje, int minimo){
        int valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextInt();
                valido = valor >= minimo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    
    public static int leeInt(String mensaje, int minimo, int maximo){
        int valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextInt();
                valido = valor >= minimo && valor <= maximo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static float leeFloat(){
        float valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                valor = teclado.nextFloat();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static float leeFloat(String mensaje){
        float valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextFloat();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static float leeFloat(String mensaje, float minimo){
        float valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextFloat();
                valido = valor >= minimo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    
    public static float leeFloat(String mensaje, float minimo, float maximo){
        float valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextFloat();
                valido = valor >= minimo && valor <= maximo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static double leeDouble(){
        double valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                valor = teclado.nextDouble();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static double leeDouble(String mensaje){
        double valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextDouble();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static double leeDouble(String mensaje, double minimo){
        double valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextDouble();
                valido = valor >= minimo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    
    public static double leeDouble(String mensaje, double minimo, double maximo){
        double valor = 0;
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextDouble();
                valido = valor >= minimo && valor <= maximo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static String leeString(){
        String valor = "";
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                valor = teclado.nextLine();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static String leeString(String mensaje){
        String valor = "";
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextLine();
                valido = true;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static String leeString(String mensaje, int minimo){
        String valor = "";
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextLine();
                valido = valor.length() >= minimo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    
    public static String leeString(String mensaje, int minimo, int maximo){
        String valor = "";
        boolean valido = false;
        Scanner teclado;
        do{
            teclado = new Scanner(System.in);
            try{
                System.out.print(mensaje);
                valor = teclado.nextLine();
                valido = valor.length() >= minimo && valor.length() <= maximo;
            }catch(Exception e){
                valido = false;
            }
        }while(!valido);
        return valor;
    }
    
    public static void print(String mensaje){
        System.out.print(mensaje);
    }
    
    public static void println(String mensaje){
        System.out.println(mensaje);
    }
}
