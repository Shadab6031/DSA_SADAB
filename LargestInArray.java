import java.util.*;
public class LargestInArray 
{
    public static int largest(int arr[])
     {
       int large =Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>large)
        {
           large=arr[i];
        }
       }
       return large;
    }
   public static void main(String[] args) 
   {
      Scanner s = new Scanner(System.in);
      System.out.print("enter size of an array- ");
      int size = s.nextInt();
      System.out.println("enter arrays elements ");
      int[] arr=new int[size];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=s.nextInt();
      }
      System.out.println(largest(arr)+" is largest element");
   } 
}
