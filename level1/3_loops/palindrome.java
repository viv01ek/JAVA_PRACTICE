import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num = sc.nextInt();
        int ognum = num;
        int rev = 0;

        while(num!=0){
            int temp = num%10;
            rev = rev*10 + temp;
            num = num/10;
        }
        if (rev == ognum) {
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
