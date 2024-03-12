public class arraysum {

    public int arraysumm(int[] arr,int size){
        if(size<=0){
            return 0;
        }
        return arr[size-1] + arraysumm(arr, size-1);
    }
    public static void main(String[] args) {
        arraysum A = new arraysum();
        int[] a = {1,2,3,4,5,6,7};
        int b = A.arraysumm(a, a.length);
        System.out.println(b);
    }
}
