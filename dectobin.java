public class dectobin{
    void convert(int n){
        int[] binary = new int[40];
        int i=0;
        while(n>0){
            binary[i++] = n % 2;
            n = n/2;
        }

        for(int j=i-1;j>0;j--){
            System.out.print(binary[j]);
        }
    }
    public static void main(String[] args) {
        dectobin A = new dectobin();
        A.convert(322);
    }
}