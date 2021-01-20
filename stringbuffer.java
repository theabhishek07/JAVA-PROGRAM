public class stringbuffer 
{
    public static void main(String[] args) 
    {
        StringBuffer s1=new StringBuffer("JAVA");
        StringBuffer s2= new StringBuffer("HOLIDAYS");
        StringBuffer s3= new StringBuffer("SIRI");
        StringBuffer s4= new StringBuffer("GOOGLE");
        StringBuffer s5= new StringBuffer("NETFLIX");
        s1.append("world");
        System.out.println(s1);
        s2.insert(0,"no");
        System.out.println(s2);
        s3.replace(1,4,"dddd");
        System.out.println(s3);
        s4.delete(1,3);
        System.out.println(s4);
        s5.reverse();
        System.out.println(s5);
        System.out.println(s5.capacity());
    }
    
}
