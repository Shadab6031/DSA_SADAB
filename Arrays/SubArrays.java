import java.util.*;
public class SubArrays 
{
   public static void SubArr(int [] arr) 
   {
      for(int i=0;i<arr.length;i++)
      {
         int start =i;
         for(int j=i;j<arr.length;j++)
         {
           int end=j;
           for(int k=start;k<=end;k++)
           {
            System.out.print(arr[k]+" ");
           }
           System.out.println();
         }
         System.out.println();

      }
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
     SubArr(arr);
   } 
}
