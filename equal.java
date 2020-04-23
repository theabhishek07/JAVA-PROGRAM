public class eqaual {
    public static void main(String[] args) {
        String s1="abhishek";
        String s2="sharma";
        String s3=new String ("abhishek");
        String s4="abhinav";
        String s5="abhinav";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s5);
        System.out.println(s4.compareTo(s5));
        System.out.println(s5.compareTo(s1));
    }
    
}
