import java.util.*;
public class CharAt 
{
    public static void length(String fullName)
    {
        for(int i=0 ; i<fullName.length();i++)
        {
            System.out.println("character at index "+i+" is "+fullName.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first name ");
        String Firstname=s.nextLine();
        System.out.println("enter last name ");
        String lastName=s.nextLine();
        String fullName=Firstname+" "+lastName;
        System.out.println(fullName);
        System.out.println(Firstname.length() +","+ lastName.length()+ ","+ fullName.length());
        length(fullName);
    }
}
