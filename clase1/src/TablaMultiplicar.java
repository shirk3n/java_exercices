public class TablaMultiplicar {

    public static void main(String[] arg) {
        System.out.println("TABLAS DE MULTIPLICAR:");
        for (int multiplicando=1; multiplicando<10; multiplicando++){
            System.out.println("\n Tabla del " + multiplicando);
            for (int multiplicador=1; multiplicador<10; multiplicador++){
                System.out.println("\t " + multiplicando + " x " +  multiplicador
                        + " = " + (multiplicando*multiplicador) );
            }
        }
    }
}