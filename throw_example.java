public class throw_example {
    static void testAge(int n){
        if(n<18)
            throw new ArithmeticException("less age");
        else
            System.out.println("18 years boy");
    }
    public static void main(String[] args) {
        testAge(17);
        System.out.println("rest of code");   
    }  
}
