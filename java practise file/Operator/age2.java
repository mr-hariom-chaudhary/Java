import java.util.Scanner;
public class age2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age : ");
        int age = sc.nextInt();
        sc.close();
        if(age<18)
            System.out.println("You are child");
        else if (age>=18 && age<=60)
            System.out.println("You are young");
        else
        System.out.println("You are Senior Citizen");
    }
}
