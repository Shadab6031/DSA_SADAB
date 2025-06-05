import java.util.Arrays;

public class Transpose 
{
    public static void Trans(int [][]mat)
    {
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        System.out.println("transposed matrix is "+Arrays.deepToString(mat));

    }
    public static void main(String[] args) 
    {
        int mat[][] =  {
    {1, 2, 3, 4},
    {1, 2, 3, 4},
    {1, 2, 3, 4},
    {1, 2, 3, 4}
    };
    System.out.println("original matrix is "+ Arrays.deepToString(mat));
    Trans(mat);
    }
}
