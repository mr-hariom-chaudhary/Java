import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principal Amount : ");
        int amount = sc.nextInt();
        System.out.println("Enter The Rate Of Interest : ");
        float roi = sc.nextFloat();
        System.out.println("Enter The Year : ");
        int year = sc.nextInt();
        sc.close();
        float si = (amount*roi*year)/100;
        System.out.printf("The Simple Interest of %d for %d years is %f",amount,year,si);
    }
}
