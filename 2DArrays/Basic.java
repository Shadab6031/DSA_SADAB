import java.util.*;
public class Basic 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       System.out.println("enter number of rows ");
       int rows = s.nextInt();
       System.out.println("enter number of columns");
       int col=s.nextInt();
       int matrix[][] = new int[rows][col];
       System.out.print("enter elements - ");
         for(int i=0;i<rows;i++)
         {
            for(int j=0;j<col;j++)
            {
               matrix[i][j] =s.nextInt();
            }
         }
          for(int i=0;i<rows;i++)
         {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
         }
    }
}
