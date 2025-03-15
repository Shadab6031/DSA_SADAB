import java.util.*;
public class LinearSearch
{
    public static int linear(int[] arr,int key)
    {
      
      for(int i=0;i<arr.length;i++)
      {
         if(key==arr[i])
         {
            return i;
         }
      }
      return -1;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of array -");
        int size=s.nextInt();
        int[]arr=new int[size];
        System.out.println("enter array elements ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("enter an element to search ");
       int key =s.nextInt();
        int index = linear(arr,key);
        if(index==-1)
        {
          System.out.println("element not found");
        }
        else
        {
            System.out.println(key+" found at index "+index);
        }
    }
}
