import java.util.*;
public class Prime 
{
    public static void main(String[] args) 
    {   boolean a = true;
               
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n =s.nextInt();
        
            for(int i=2;i<n;i++)
            {
               if(n%i==0)
               {
                a = false;
               
               }
              
            }
            if (a==false)
             {
             System.out.println("not prime");   
            }
            else{
                System.out.println("prime");
            }
        }
        
    
}
