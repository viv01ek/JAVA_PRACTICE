import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
    
        int ognum=num;
        int armnum = 0;
        int digit = 0;

        int power = String.valueOf(num).length() ;
    
        while (num!=0) {
           digit = num%10 ;
           armnum += (int)Math.pow(digit,power);
           num = num/10;
        }

        if (ognum==armnum) {
            System.out.println("its an armstrong number");
        }else{
            System.out.println("its not an armstrong num ");
        }
        
    }
}
