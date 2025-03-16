import java.util.*;
public class Pattern 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of coloumn-");
        int col = s.nextInt();
        System.out.print("enter number of rows-");
        int row =s.nextInt();
        //outer loop
        for(int i =0;i<row;i++)
        {
            //inner loop
            for(int j=0;j<col;j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
