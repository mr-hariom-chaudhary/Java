import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age : ");
        int year = sc.nextInt();
        sc.close();
        if(year>=18)
        System.out.println("You are eligible to vote");
        else
        System.out.println("You are not eligible to vote");
    }
}
