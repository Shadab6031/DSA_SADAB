import java.util.*;
public class BubbleSort {
    public static void Bubble(int arr[])
    {
        for(int turn =0;turn<arr.length-1;turn++)
        {
            for(int i=0;i<arr.length-1-turn;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp =arr[i+1];
                    arr[i+1] =arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,1,4,2};
        Bubble(arr);
    }
}
