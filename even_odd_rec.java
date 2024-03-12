public class even_odd_rec {
    public static void main(String[] args) {
        even_odd_rec obj = new even_odd_rec();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        obj.carr(arr, 0, arr.length - 1);
    }

    public void carr(int[] arr, int start, int end) {
        int[] A = new int[arr.length];
        int[] B = new int[arr.length];
        int x = 0;
        int y = 0;

        if (start <= end) {
            if (arr[start] % 2 == 1) {
                B[x] = arr[start];
                x++;
            } else {
                A[y] = arr[start];
                y++;
            }
            carr(arr, start + 1, end);
        }
        for (int i = 0; i < x; i++) {
            System.out.println(B[i]);
        }
    }
}
