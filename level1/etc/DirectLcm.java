import java.util.*;
public class DirectLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number2 :");
        int num2 = sc.nextInt();
        
        int i = 1;
        while (true) {
            int lcm = num1 * i;
            if (lcm%num2==0) {
                System.out.println("lcm is "+lcm);
                break;
            }
            i++;
        }
    }
}
