import java.util.Scanner;
public class javabasic {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Java Class \t");
        System.out.println("Enter you number first");
        int a = sc.nextInt();
        System.out.println("Enter you number second");
        int b = sc.nextInt();
        sc.close();
        int c =  a + b;
        System.out.println("The Sum of a and b: "+ c);
        System.out.print("This is sum of a and b: "+ c);
    }
}
