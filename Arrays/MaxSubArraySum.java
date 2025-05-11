//Brute Fore O(n^3)

import java.util.*;
public class MaxSubArraySum {
    public static void SumSubarr(int[] arr, int sum) {
        sum = 0;
        int MAXSUM=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) { 
                int end = j;
                sum=0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                System.out.println("sum is "+sum); 
                if(MAXSUM<sum)
                {
                    MAXSUM=sum;
                }
            }
        }
        System.out.println("maximum sum is "+MAXSUM);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter size of array- ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("array is " + Arrays.toString(arr));
        SumSubarr(arr, size);
    }
}
