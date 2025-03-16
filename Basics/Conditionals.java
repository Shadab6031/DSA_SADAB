import java.util.*;

public class Conditionals
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        if (n>0)
        {
            System.out.println("this is a positive number");
        }
        else
        {
            System.out.println("this is a negative number");
        }
    }
}