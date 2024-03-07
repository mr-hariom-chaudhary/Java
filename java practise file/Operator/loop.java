import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Number : ");
        int num = sc.nextInt();
        sc.close();
        for(int i = 1; i <= num; i++) {
            if(i%2==0)
                System.out.print(i+" Is Even Number \t");
            else
                System.out.print(i+" Is Odd Number \t");
        }
    }
}
