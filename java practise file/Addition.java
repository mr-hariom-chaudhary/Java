import java.util.*;

public class Addition{
    public static void main(String args[]) {
        int x, y, sum,p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        sum = sum(x, y);
        System.out.println("The sum of two numbers x and y is: " + sum);
        sc.close();
    }

    // method that calculates the sum
    public static int sum(int x, int y) {
        int sum = y + x;
        return sum;
    }
}