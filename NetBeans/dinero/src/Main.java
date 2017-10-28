import java.util.Scanner;

/**
 * Created by jdelgado on 18/10/2017.
 * que introduzca el usuario un valor numérico entero y tienes que indicarle a cuántas monedas de 1 y 2 euros, billetes de 5 10 20 50 100 200 500 euros corresponde ese importe
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado;
        double dinero;
        System.out.println("Introduce un importe entero: ");
        teclado = new Scanner(System.in);
        dinero = teclado.nextDouble();
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j=0;
        double dineroNuevo = 0;

            //Si coincide con cada billete
            if (500 / dinero == 1 || 200 / dinero == 1 || 100 / dinero == 1 || 50 / dinero == 1 || 20 / dinero == 1 || 10 / dinero == 1 || 5 / dinero == 1 || 2 / dinero == 1 || 1 / dinero == 1) {
                System.out.println("El desglose es: " + dinero);
            }
            if (dinero > 200 && dinero < 500) {
                a = 200;
                dineroNuevo = dinero;
                dineroNuevo -= a;
                if ((200 / dineroNuevo == 1 || 100 / dineroNuevo == 1 || 50 / dineroNuevo == 1 || 20 / dineroNuevo == 1 || 10 / dineroNuevo == 1 || 5 / dineroNuevo == 1 || 2 / dineroNuevo == 1 || 1 / dineroNuevo == 1)) {
                    System.out.println("El desglose es: " + dineroNuevo + " y " + a);
                }else if (dineroNuevo > 200 && dineroNuevo < 300) {
                    dineroNuevo -= a;

                }  if (dineroNuevo > 100 && dineroNuevo < 200) {
                    b = 100;
                    dineroNuevo -= b;

                }  if (dineroNuevo > 50 && dineroNuevo < 100) {
                    d = 50;
                    dineroNuevo -= d;

                }  if (dineroNuevo > 30 && dineroNuevo < 50) {
                    e = 20;
                    dineroNuevo -= e;
                }
                    if (dineroNuevo > 20 && dineroNuevo < 30) {
                        j = 20;
                        dineroNuevo -= j;
                }  if (dineroNuevo > 10 && dineroNuevo < 20) {
                    f = 10;
                    dineroNuevo -= f;

                }  if (dineroNuevo > 5 && dineroNuevo < 10) {
                    g = 5;
                    dineroNuevo -= g;

                }  if (dineroNuevo > 2 && dineroNuevo < 5) {
                    h = 2;
                    dineroNuevo -= h;

                }  if (dineroNuevo > 1 && dineroNuevo < 2) {
                    i = 1;
                    dineroNuevo -= i;
                }
                System.out.println("El desglose es: " + dineroNuevo + " , " + a+ " , " + b+ " , " + c+ " , " + d+ " , " + e+ " , " + f+ " , " + g+ " , " + h+ " , " + i+ " , " + j);
            }

    }
}