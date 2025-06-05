import java.util.*;
public class palindrome 
{
    public static void pal(int n)
    {
        int original =n;
        int ans=0;
       while(n>0)
       {
         int u=n%10;
         ans =ans*10+u;
         n =n/10;
       }
       if(ans==original)
       {
        System.out.println("this is a palindrome number");
       }
       else{
        System.out.println("not a palindrome");
       }
    }
   public static void main(String[] args) 
   {
      Scanner s= new Scanner(System.in);
      int n = s.nextInt();
      pal(n);

   }    
}
