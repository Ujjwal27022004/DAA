public class even_odd {
    public static void main(String[] args) {
        even_odd obj = new even_odd();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        obj.carr(arr);
    }

    public void carr(int[] arr) {
        int[] A = new int[arr.length];
        int[] B = new int[arr.length];
        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                B[x] = arr[i];
                x++;
            } else {
                A[y] = arr[i];
                y++;
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < x; i++) {
            System.out.println(B[i]);
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < y; i++) {
            System.out.println(A[i]);
        }
    }
}
