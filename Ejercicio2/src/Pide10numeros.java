import java.util.Scanner;

/**
 * Programa que pide diez números por teclado y dice cuál es el mayor
 * y cuál es el menor. No se permite usar arrays.
 *
 * @author JoséManuel
 */
public class Pide10numeros {

    public static void pedir10numeros(){

        int numeroMayor = Integer.MIN_VALUE ;    // El nº más grande introducido
        int numeroMenor = Integer.MAX_VALUE;     // El nº más pequeño introducido

        int numero;                             // El nº que va introduciendo el usuario, diez veces
        int contador;                           // Contabiliza el nº de veces que se introduce el número

        Scanner teclado = new Scanner(System.in); //System es en el sistema donde se ejecuta por defecto
        for (contador=1; contador<=10; contador++){
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt(); //Se interpreta como entero

            if (numero > numeroMayor)
                numeroMayor = numero;
            if (numero < numeroMenor)
                numeroMenor=numero;
        }
        System.out.println("El número más grande es " + numeroMayor +
                " y el más pequeño es "+ numeroMenor);
    }

    public static void main(String[] args) {

        pedir10numeros();
    }

}