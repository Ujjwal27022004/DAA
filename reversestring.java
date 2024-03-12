public class reversestring {

    String reverse(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        reversestring A = new reversestring();
        String str = A.reverse("ujjwal");
        System.out.println(str);
    }

}
