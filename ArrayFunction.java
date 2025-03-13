import java.util.*;
public class ArrayFunction 
{
    public static void Update(int[]marks)
    {
      for(int i=0;i<marks.length;i++)
      {
        marks[i]=marks[i]+1; 
      }
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of students - ");
        int n=s.nextInt();
        int[] marks =new int[n];
        System.out.println("enter marks - ");
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=s.nextInt();
        }
        Update(marks);
        System.out.println("updated marks is");
    for(int i =0; i<marks.length;i++)
    {
      System.out.print(+marks[i]+" ");
    }
    System.out.println();
    }
}
