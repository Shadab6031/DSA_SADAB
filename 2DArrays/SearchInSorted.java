import java.util.*;
public class SearchInSorted 
{
    public static int[] Search(int [][]mat , int key)
    {
        int col=mat[0].length-1;
        int row=0;
        while(row<mat.length && col >=0)
        {
            if(mat[row][col]==key) return new int[]{row,col};
           else if(key< mat[row][col]) col--;
           else row++;

        }
        return new int[]{-1,-1};
    }
   public static void main(String[] args) 
   {

    int[][] mat = {
    {10, 20, 30, 40},
    {15, 25, 35, 45},
    {27, 29, 37, 48},
    {32, 33, 39, 50}
    };
 int key=50;
 int[] ans=Search(mat, key);
  if (ans[0] == -1 && ans[1] == -1)
 {
    System.out.println("element not found");
 }
 else
 {
 System.out.println("element found at " + Arrays.toString(ans));

 }
   } 
}
