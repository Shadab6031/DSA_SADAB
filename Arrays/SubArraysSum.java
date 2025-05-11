import java.util.*;
public class SubArraysSum 
{
   public static void SubArrSum(int [] arr) 
   {
      int sum=0;
      int maxSum=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
        //  int start =i;
         for(int j=i;j<arr.length;j++)
         {
        //    int end=j;
             sum=0;
           for(int k=i;k<=j;k++)
           {
 sum +=arr[k];
        }
           System.out.println("sum is "+sum);
           if(maxSum<sum)
           {
            maxSum=sum;
           }
         }
      }
      System.out.println(maxSum);
   }
   public static void main(String[] args) 
   {
     Scanner s=new Scanner(System.in);
     System.out.print("enter size of array - ");
     int size=s.nextInt();
     int[] arr = new int[size];
     System.out.println("enter array elements ");
     for(int i=0;i<arr.length;i++)
     {
      arr[i]=s.nextInt();
     }
     System.out.println("Array is "+ Arrays.toString(arr));
     SubArrSum(arr);
   } 
}
