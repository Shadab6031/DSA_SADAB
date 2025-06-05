import java.util.*;
public class DiagonalSum 
{
    public static int Sum(int [][]mat)
    {
        if(mat.length != mat[0].length)
        {
            return 0;
        }
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
           //primary diagonal row(i)==column
           sum +=mat[i][i];
           if(i != mat.length-i-1)
           //secondry diagonal row(i)+column=mat.length-1
           sum += mat[i][mat.length-i-1];
        }
        return sum;

    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows");
        int row=s.nextInt();
        System.out.println("enter numbers of column");
        int col=s.nextInt();
        int [][]mat=new int[row][col];
        System.out.println("enter matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               mat[i][j]=s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(mat));
        int ans=Sum(mat);
        if(ans==0)
        System.out.println("Diagonal does not exist , size of row and coloumn should be same");
        else
        System.out.println("Sum of diagonal's elements is = "+ ans);
    }
}
