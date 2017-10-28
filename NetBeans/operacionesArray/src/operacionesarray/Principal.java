/*
    Vamos a crear una lista de pesos de un hombre con sobrepeso que intenta adelgazar. Vamos a solicitar 
    12 pesos, van a guardarse dentro de un array de pesos de 12 posiciones y luego vamos a indicar el más alto
    el más bajo, la media de peso y los pesos que superan la media y los que no llegan a ella
 */
package operacionesarray;

/**
 *
 * @author Juan
 */
public class Principal {
    public static void main(String []args){
        //Lista de tipo double o float para pesos
        Double pesos[] = new Double[12];
        //Bucle de 12 vueltas para insertar los 12 pesos
        double pesoIntroducido;
        double media;
        double suma=0.0;
        double maximo=Double.MIN_VALUE;
        double minimo=Double.MAX_VALUE;
        
        System.out.println("--Vamos a introducir 12 registros de tu peso--");
        for(int i=0; i<12;i++){
            pesoIntroducido = ES.leeDouble("Introduce el peso del registro numero "+i+"\n");
            //Variable para la media, para la suma del total, para el máximo y el mínimo
            pesos[i]=pesoIntroducido; 
        }
        for(int j=0; j<pesos.length;j++){
            suma=suma+pesos[j];
            if(pesos[j]>maximo){
                maximo=pesos[j];
            }
            if(pesos[j]<minimo){
                minimo=pesos[j];
            }
        }
        media=suma/pesos.length;
        System.out.println("La suma de todos los pesos es: "+suma);
        System.out.println("La media de todos los pesos es: "+media);
        System.out.println("El máximo de todos los pesos es: "+maximo);
        System.out.println("El mínimo de todos los pesos es: "+minimo);
        
        //Bucle para calcular el total, el maximo y el minimo
        //Calcular la media con el total ya sacado
        //Mostrar todo por pantalla
    }
}

