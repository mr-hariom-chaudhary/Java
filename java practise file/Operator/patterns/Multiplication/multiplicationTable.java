package Multiplication;
import java.util.Scanner;

// Implementation of stack using array

public class multiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d \n",num,i,num*i);
        }
    }
}
