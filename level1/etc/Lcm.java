import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1:");
        int num = sc.nextInt();
        System.out.println("enter number2:");
        int num2 = sc.nextInt();
        int HCF = 0;
        for (int i = 1; i <= num && i<=num2; i++) {
            if (num%i==0 && num2%i==0) {
                HCF=i;
            }
        }
        System.out.println("HCF is "+HCF);
        int lcm =(num*num2)/HCF;
        System.out.println("lcm is "+lcm);
    }
}
