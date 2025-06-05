import java.util.*;
public class palindrome 
{
    public static boolean Pal(String str)
    {
        int n = str.length();
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            if(str.charAt(left)==str.charAt(right))
            {
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("enter a string ");
        String str = s.next();
        System.out.println(Pal(str));
    }
}
