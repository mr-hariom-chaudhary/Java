package Multiplication;
import java.util.Scanner;

// Euclidian Algorithm

public class GreatestCommonDivision {
    public static void main(String[] args) {
        int num1,num2,gcd=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Greater Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter The Smaller Number : ");
        num2 = sc.nextInt();
        sc.close();
        for(int i=1;i<=num1 && i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd = i;
            }
        }
        System.out.printf("The GCD Of %d And %d Is %d",num1,num2,gcd);
    }
}
