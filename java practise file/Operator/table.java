import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number You Want To Print Table Of : ");
        int num = sc.nextInt();
        sc.close();
        for(int i =1;i<=10;i++)
        {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
