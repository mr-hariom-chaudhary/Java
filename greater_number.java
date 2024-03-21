import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter The Third Number : ");
        int num3 = sc.nextInt();
        sc.close();
        if(num1>num2 && num1>num3)
        System.out.printf("%d is Greatest Number",num1);
        else if(num2>num3 && num2>num1)
        System.out.printf("%d is Greatest Number",num2);
        else
        System.out.printf("%d is the Greatest Number",num3);
    }
}
