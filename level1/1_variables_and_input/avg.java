import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a:");
        double a = sc.nextInt();

        System.out.println("enter b:");
        double b = sc.nextInt();

        System.out.println("enter c:");
        double c = sc.nextInt();

        double avg = (a+b+c)/3;

        System.out.print("average = ");
        System.out.printf("%.2f",avg);
    }
}
