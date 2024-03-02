import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Second Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter The Third Number : ");
        int num3 = sc.nextInt();
        sc.close();

        if(num1>num2 && num2>num3)
        {
            System.out.println(num1+" Is The Greatest Number");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println(num2+" Is The Greatest Number");
        }
        else
        {
            System.out.println(num3+" Is The Greatest Number");
        }

    }
}
