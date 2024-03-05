package Operator;
import java.util.Scanner;


public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Marks Of Java : ");
        int java = sc.nextInt();
        System.out.println("Enter The Marks Of Python : ");
        int python = sc.nextInt();
        System.out.println("Enter The Marks Of Data Warehouse & Mining : ");
        int dwm = sc.nextInt();
        System.out.println("Enter The Marks Of Computer Network : ");
        int cn = sc.nextInt();
        System.out.println("Enter The Marks Of Design Analysis & Algorithm : ");
        int daa = sc.nextInt();
        sc.close();

        int totalMarks = java+python+dwm+cn+daa;
        float percentage = totalMarks/5;
        // System.out.println(percentage);
        if(percentage>=80 && percentage<100)
        {
            System.out.println("O Grade");
        }
        else if(percentage>=75 && percentage<80)
        {
            System.out.println("A+ Grade");
        }
        else if(percentage>=70 && percentage<75)
        {
            System.out.println("A Grade");
        }
        else if(percentage>=65 && percentage<70)
        {
            System.out.println("B+ Grade");
        }
        else if(percentage>=50 && percentage<65)
        {
            System.out.println("B Grade");
        }
        else if(percentage>=40 && percentage<50)
        {
            System.out.println("C Grade");
        }
        else
        {
            System.out.println("The Student Is Fail");
        }
    System.out.println("The Total Percentage Is : "+percentage);
    }
}
