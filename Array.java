import java.util.*;
public class Array
{
    public static void main(String[] args) 
    {
        Scanner s =new Scanner(System.in);
        System.out.print("enter the size of an array - ");
        int n =s.nextInt();
        int [] arr = new int[n];
         // arr[0]=5;
        // arr[1]=467;
        // arr[2]=89;
        // arr[3]=69;
        // arr[4]=139;
    System.out.println("enter array elements");
     for(int i =0; i<arr.length;i++)
     {
        arr[i]=s.nextInt();
     }
    //  for(int i =0; i<arr.length;i++)
    //  {
    //     System.out.print(arr[i]+",");
    //  }
    System.out.println(Arrays.toString(arr));
    }
 }