import java.util.*;
public class posnegzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num==0) {
            System.out.println("number is zero");
        }
        else if (num>0) {
            System.out.println("positive number");}
        else{
            System.out.println("negative number");
        }
    }
}