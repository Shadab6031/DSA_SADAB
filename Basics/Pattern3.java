//inverted half pyramid
// ****
// ***
// **
// *

import java.util.Scanner;

public class Pattern3 
{
     public static void main(String[] args) 
 {
    Scanner sc =new Scanner(System.in);
    System.out.print("enter the row or column - ");
    int n= sc.nextInt();
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
 }   
}
    
