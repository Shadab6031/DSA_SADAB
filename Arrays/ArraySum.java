import java.util.*;
import java.util.concurrent.SubmissionPublisher;
public class ArraySum 
{
    public static int sum(int []arr ,int Sum)
    {
        Sum=0;
        for(int i=0;i<arr.length;i++)
        {
            Sum=Sum+arr[i];
        }
        return Sum;
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of array - ");
        int size = s.nextInt();
        int [] arr = new int[size];
        System.out.println("enter array elements ");
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("array is "+Arrays.toString(arr));
        System.out.println("sumof the elements is "+ sum(arr, size));

    }
}
