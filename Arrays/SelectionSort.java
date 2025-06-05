import java.util.*;
public class SelectionSort 
{
    public static void Selection(int []arr)
    {
        for(int turn=0;turn<arr.length-1;turn++)
        {
            int lowest=turn;
            for(int i=turn+1;i<arr.length;i++)
            {
                if(arr[i]<arr[lowest])
                {
                    lowest=i;
                }
            }
            int temp=arr[turn];
            arr[turn]=arr[lowest];
            arr[lowest]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
  public static void main(String[] args) 
  {
    int arr[]={3,2,5,1,4};
    Selection(arr);
  }   
}
