import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Age : ");
        int age = sc.nextInt();
        sc.close();
        if(age>=18)
        System.out.println("You are eligible to vote");
        else
        System.out.println("You are not eligible to vote");
    }
}
