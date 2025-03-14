public class BinarySearchArray 
{
    public static int binary(int key , int[]arr)
    {
        int left =0;
        int right =arr.length-1;
        while(left<=right)
        {
            int mid =(left + right)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                left =mid+1;
            }
            else
            {
                right=mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int[] arr = new int[]{1,3,4,5,20};
        int key =9;
          int index=binary(key ,arr);
            if(index ==-1)
            {
                System.out.println("element not found");
            }
            else 
        {
            System.out.println("element found at index "+index) ;
        }

     }
}
