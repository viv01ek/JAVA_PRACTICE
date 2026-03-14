import java.util.*;
public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();
        boolean prime = true;
        
        for (int i = 2; i < num-1; i++) {
            if(num%i==0){
               prime = false;
               break;
            }           
        }
        if (prime && num > 1)
            System.out.println("prime");
        else
            System.out.println("not prime");
        }
    }
