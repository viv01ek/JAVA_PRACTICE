import java.util.*;
public class SquareNum {
    public static int square(int n){
        return n*n;
    }
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = square(n);
        System.out.println(result);
        sc.close();
    }
}
