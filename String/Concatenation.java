import java.util.*;
public class Concatenation 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first name ");
        String Firstname=s.nextLine();
        System.out.println("enter last name ");
        String lastName=s.nextLine();
        String fullName=Firstname+" "+lastName;
        System.out.println(fullName);
        System.out.println("length of FirstName- "+Firstname.length() +"\nlength of LastName-"+ lastName.length()+ "\nlength of FullName-"+ fullName.length());
    }
}
