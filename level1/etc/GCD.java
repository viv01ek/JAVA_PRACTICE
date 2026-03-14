import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int num = sc.nextInt();
        System.out.print("enter second number :");
        int num2 = sc.nextInt();
        int gcd = 0;
        for(int i=1;i<=num&&i<=num2;i++){
            if (num%i==0&&num2%i==0) {
                gcd = i;
            }
        }
        System.out.println("GREATEST COMMON FACTOR IS : "+gcd);
    }
}
