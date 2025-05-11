import java.util.*;
public class Pairs 
{
    public static void printPairs(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.println("("+curr+" "+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in);
       System.out.print("enter size of array - ");
       int size = s.nextInt();
       System.out.println("enter array element ");
       int []arr=new int[size];
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=s.nextInt();
       } 
       System.out.println("array is "+ Arrays.toString(arr));
       printPairs(arr);
    }
}
