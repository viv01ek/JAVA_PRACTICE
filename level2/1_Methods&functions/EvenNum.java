import java.util.*;
public class EvenNum {
    public static boolean even(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        boolean result = even(n);

        if(result) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        sc.close();
    }
}
