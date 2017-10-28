public class diezPriNumParesDesc {
    public static void diezPrimerosParesDesc() {
        int max=0;
        int i = 0;
        int[] array = new int [20];
        while(max<10){
            if(i%2==0){
                array[i]=i;
                max++;
            }
            i++;
        }
        for(int j=array.length; j>=0;j--){
            System.out.println(array[j]);
        }
    }
    public static void main(String[] args) {
        diezPrimerosParesDesc();
    }
}
