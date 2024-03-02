import java.util.*;

public class TypeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your Address : ");
        String address = sc.next();
        System.out.print("Enter Your Phone No. : ");
        long mobile = sc.nextLong();
        System.out.print("Enter Your Email Id : ");
        String email = sc.next();
        System.out.print("Enter Your Gender : ");
        String gender = sc.next();
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        System.out.print("Enter Your Height : ");
        float height = sc.nextFloat();
        System.out.print("Enter Your Weight : ");
        int weight = sc.nextInt();
        sc.close();
       
        System.out.println("Your Name Is : "+name);
        System.out.println("Your Address Is : "+address);
        System.out.println("Your Mobile Number Is : "+mobile);
        System.out.println("Your Email Id Is : "+email);
        System.out.println("Your Gender Is : "+gender);
        System.out.println("Your Age Is : "+age);
        System.out.println("Your Height Is : "+height);
        System.out.println("Your Weight Is : "+weight);
    }
}
