import java.util.*;
public class EvenorOddinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int evens = 0;
        int odds = 0;
        int digit = 0;

        while (num != 0) {
            digit = num%10;
            num = num/10;
            if (digit%2==0) {
                evens++;
            }else{
                odds++;
            }
        }
        System.out.println("number of even digits :"+evens);
        System.out.println("number of odd digits :"+odds);
    }
}
