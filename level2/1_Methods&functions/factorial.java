import java.util.*;
public class factorial {
    public static int fact(int n){
        int temp = 1;
       for(int i=1;i<=n;i++){
        temp *= i;     
       }
       return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        int result = fact(n);
        System.out.println("factorial of "+n+" is "+result);
        sc.close();
    }
}
