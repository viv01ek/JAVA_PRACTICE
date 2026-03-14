import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter num:"); 
        int num = sc.nextInt();
        int rev = 0;
       
        while(num != 0){
        
        int temp = num%10;
        rev = rev*10 + temp;
        num = num/10;
        }
        System.out.println("reverse:"+rev);
    }
    
}
