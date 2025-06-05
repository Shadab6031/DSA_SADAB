public class compare 
{
    public static void main(String[] args) 
    {
        String s="sadab";
        String s2="sadab";
        System.out.println(s==s2); //== compares memory address
        String s3 = new String("sadab");
        System.out.println(s==s3);
        System.out.println(s2==s3);
        System.out.println(s.equals(s3)); //.equals() compares atual content
      
        //compareTo

        String s4="khan";
        System.out.println(s.compareTo(s4)); //lexicographically comparison returns positive value if 
        System.out.println(s.compareTo(s3)); // returns 0
        System.out.println(s4.compareTo(s)); // return negative number

        //equalsIgnoreCase()
        String s5="KHAN";
        // System.out.println(s4==s5);  it print false
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
