import java.util.*;
public class ReverseArray 
{
    public static void reverse(int[] arr)
    {
      int left=0,right=arr.length-1;
      while(left<right)
      {
        int temp =arr[right];
        arr[right]=arr[left];
        arr[left]=temp;
        left++;
        right--;
      }
     }
   public static void main(String[] args) 
   {
     Scanner s = new Scanner(System.in);
     System.out.print("enter size of array- ");
     int size = s.nextInt();
     System.out.println("enter array elements");
     int[] arr = new int[size];
     for(int i=0;i<arr.length;i++)
     {
        arr[i]=s.nextInt();
     }
     System.out.println("Original array is "+Arrays.toString(arr));
     reverse(arr);
     
        System.out.println("Reversed array is  "+Arrays.toString(arr));
     
   } 
}
