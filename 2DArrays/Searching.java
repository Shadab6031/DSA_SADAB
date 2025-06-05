

import java.util.*;
public class Searching
{
    public static boolean Search(int[][]matrix ,int key)
    {
         int row=matrix.length;
         int col=matrix[0].length;
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==key){
                    System.out.println("element found at cell ("+i+","+j+")");
                    return true;
                }
            }
         }
          System.out.println("element not found");
            return false;
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
          System.out.println("enter number to find ");
          int key =s.nextInt();
          Search(matrix, key);
    }
}
