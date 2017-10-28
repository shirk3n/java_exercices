import java.util.Scanner;

/**
 * Created by jdelgado on 11/10/2017.
 * <p>
 * Vamos a crear una aplicación para llevar un registro de nuestros pesos.
 * Vamos a plantear un menú:
 * Menú principal
 * 1.- Añadir peso
 * 2.- Ver pesos
 * 3.- Ver IMC
 * 4.- Analizar datos
 * 0.- Salir
 * Opción:
 * <p>
 * Antes de arrancar el programa vamos a solicitar al usuario su altura para poder calcular el IMC
 * <p>
 * En añadir peso añadiremos otro peso más a la lista. Puede haber hasta 100 pesos
 * En ver pesos veremos los pesos que llevamos registrados
 * En ver IMC calcularemos el índice de masa corporal y se lo mostramos al usuario
 * <p>
 * En analizar datos le vamos a mostrar el peso más bajo registrado, el más alto, la media y el último. Además,
 * le diremos su IMC y le indicaremos en base a ese IMC su estado y cuánto debe adelgazar o engordar para entrar
 * en el rango de peso correcto.
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado;
        int opcion;
        double altura;
        double IMC=0;
        int contador = 1;
        double peso[] = new double[100];
        System.out.println("Por favor introduca su altura en m: ");
        teclado = new Scanner(System.in);
        altura = teclado.nextDouble();
        
        do {
            System.out.println(" 1.- Añadir peso\n" +
                    " 2.- Ver pesos\n" +
                    " 3.- Ver IMC\n" +
                    " 4.- Analizar datos\n" +
                    " 0.- Salir");
            System.out.println("Introduce la opcion que deseas: ");
            teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            IMC = peso[contador-1] / Math.pow(altura,2);
            switch (opcion) {
                case 1:
                    double pesoIntroducido;
                    System.out.println("Teclea su peso en kg: ");
                    teclado = new Scanner(System.in);
                    pesoIntroducido = teclado.nextDouble();
                    peso[contador] = pesoIntroducido;
                    contador++;

                    break;
                case 2:
                    System.out.println("Los pesos guardados son: ");
                    for (int i = 0; i < contador; i++) {
                        System.out.println(peso[i]);
                    }
                    break;
                case 3:
                    System.out.println("Su IMC es: "+IMC);
                    break;
                case 4:
                    System.out.println("Su análisis de datos es: ");
                    double pesoOptimoSup = 0;
                    pesoOptimoSup = (peso[contador-1] * 24.9 ) / IMC;
                    double pesoOptimoInf = 0;
                    pesoOptimoInf = (peso[contador-1]  * 18.5 ) /IMC;
                    System.out.println("\tSu peso óptimo oscila entre: " + pesoOptimoInf + " y " + pesoOptimoSup);
                    double kgEngordar = 0;
                    double kgAdelgazar = 0;
                    kgEngordar = pesoOptimoInf - peso[contador-1];
                    kgAdelgazar = peso[contador-1] - pesoOptimoSup;

                    if (IMC < 18.5) {
                        System.out.println("\tSu peso es muy bajo, usted tendría que engordar: " + kgEngordar + " kg, para llegar al mínimo aconsejable");
                    }
                    //Por que no se puede hacer: 18.5<=IMC<=24.5 ??
                    if (IMC >= 18.5 && IMC <= 24.9) {
                        System.out.println("\tEnhorabuena, su peso es normal");
                    }
                    if (IMC > 25 && IMC < 29.9) {
                        System.out.println("\t¡Cuidado! Tienes sobrepeso");
                        System.out.println("\tSu peso es algo alto, usted tendría que adelgazar: " + kgAdelgazar + " kg, para llegar al máximo aconsejable");
                    }
                    if (IMC > 30 && IMC < 34.9) {
                        System.out.println("\t¡Cuidado! Tienes OBESIDAD de grado 1");
                        System.out.println("\tSu peso es alto, usted tendría que adelgazar: " + kgAdelgazar + " kg, para llegar al máximo aconsejable");
                    }
                    if (IMC > 35 && IMC < 39.9) {
                        System.out.println("\t¡Mucho cuidado! Tienes OBESIDAD de grado 2");
                        System.out.println("\tSu peso es muy alto, usted tendría que adelgazar: " + kgAdelgazar + " kg, para llegar al máximo aconsejable");
                    }
                    if (IMC >= 40) {
                        System.out.println("\t¡VE INMEDIATAMENTE AL MEDICO! Tienes OBESIDAD de grado 3. La máxima.");
                        System.out.println("\tSu peso es excesivamente alto, usted tendría que adelgazar: " + kgAdelgazar + " kg, para llegar al máximo aconsejable");
                    }
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while(opcion!=0);
    }
}