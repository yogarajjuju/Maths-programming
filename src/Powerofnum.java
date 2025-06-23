public class Powerofnum {
    public static void main(String[] args) {
        int n = 8;
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
