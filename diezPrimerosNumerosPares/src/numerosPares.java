/*Programa en Java que muestra los diez primeros números pares*/

public class numerosPares {


    public static void diezPrimerosPares() {
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print(i*j);
            }
        }
    }

    public static void main(String[] args) {
        diezPrimerosPares();
    }

}
