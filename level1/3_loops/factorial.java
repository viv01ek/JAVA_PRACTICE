public class factorial {
    public static void main(String[] args) {
        int n = 15;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}