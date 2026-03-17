import java.util.*;
public class LargestofNum {
    public static int largest(int n,int n2,int n3){
        int max = 0;
        if (n>n2 && n>n3) {
            max = n;
        }else if(n2>n && n2>n3){
            max = n2;
        }else{
            max = n3;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1");
        int n = sc.nextInt();
        System.out.println("Enter number2");
        int n2 = sc.nextInt();
        System.out.println("Enter number3");
        int n3 = sc.nextInt();

        int result = largest(n, n2, n3);
        System.out.println("greatest number in "+n+","+n2+","+n3+" is "+result);
        sc.close();
    }
}