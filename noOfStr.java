import java.util.Scanner;

// Write a java code to print the count number of characters given character occurs in the string

public class noOfStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The String : ");
        String s = sc.nextLine();
        System.out.print("Enter The Character You Want To Find In The String : ");
        char c = sc.next().charAt(0);
        sc.close();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                count=count+1;
            }
        }
        System.out.printf("The Number Of %c In ' %s ' Is : %d",c,s,count);
    }
}
