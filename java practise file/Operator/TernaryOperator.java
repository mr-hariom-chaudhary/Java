package Operator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        
        String s=(year%4==0) ? "The given year\t"+year+"\tis leap year":"The given year\t"+year+"\tis not leap year";
        System.out.println(s);

        sc.close();

    }
}
