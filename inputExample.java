import java.util.*;

public class inputExample {
    public static void main(String[] args){
        String name;
        int age;
        float weight;
        

        Scanner input = new Scanner(System.in);

        System.out.println("enter your name");
        name = input.next();
        System.out.println("enter your age");
        age = input.nextInt();
        System.out.println("enter your weight");
        weight = input.nextFloat();

        System.out.println("Name " + name + " Age " + age + " Weight " + weight);
    }
}
