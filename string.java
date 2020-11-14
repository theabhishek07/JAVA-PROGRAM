//s will only print abhishek and not concat sharma because s is only reffred to string abhishek not on abhishek sharma
public class string
{
    public static void main(String[] args)
    {
        String s="abhishek";
        s.concat("sharma");
        System.out.println(s);
    }
    
}
