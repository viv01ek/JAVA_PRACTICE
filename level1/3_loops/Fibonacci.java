import java.util.*;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;        
        for(int i = 0;i<num;i++){

            System.out.print(" "+first);

            int temp = first + second; 
            first = second;
            second = temp;
        }
        sc.close();
        }
    }