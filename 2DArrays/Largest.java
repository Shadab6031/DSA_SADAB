

import java.util.*;
public class Largest
{
    public static int Large(int[][]matrix)
    {
         int row=matrix.length;
         int col=matrix[0].length;
         int n=Integer.MIN_VALUE;
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]>n){
                    n=matrix[i][j];
                }
            }
         }
            return n;
    }
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
       System.out.println("largest element is- "+Large(matrix));
    }
}
