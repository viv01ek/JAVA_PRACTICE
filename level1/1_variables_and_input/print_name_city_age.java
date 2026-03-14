import java.util.*;

public class print_name_city_age {
    
    public static void main(String[] args) {
      Scanner n = new Scanner(System.in);

      System.out.println("enter name :");
      String name = n.nextLine();

      System.out.println("enter age :");
      int age = n.nextInt();
      n.nextLine();//imp bcz it consumes new line in input buffer

      System.out.println("enter city :");
      String city = n.nextLine();

      System.out.println("name:"+name);
      System.out.println("age:"+age);
      System.out.println("city:"+city);
  }
}
