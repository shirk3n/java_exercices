public class tabla {
    public static void tablam() {
        for(int i=0; i<10; i++){
            System.out.print("\n \n Tabla del "+i + "\n");
            for(int j=0;j<10; j++){
                int suma = i+j;
                System.out.print("\t" + i+" + "+j+" = "+ suma + "\n");
            }
        }
    }
    public static void main(String[] args){
        tablam();
    }
}
