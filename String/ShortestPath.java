
public class ShortestPath 
{
    public static float Short(String Path)
    {
        int x=0;
        int y=0;
        for(int i=0;i<Path.length();i++)
        {
            if(Path.charAt(i)=='S') y--;
            else if(Path.charAt(i)=='N') y++;
            else if(Path.charAt(i)=='E') x++;
            else x--;
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);

    }
   public static void main(String[] args) 
   {
      String Path ="WNEENESENNN";
      System.out.println("shortest path is "+ Short(Path));
   }    
}
