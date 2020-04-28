public class finally_1 {
    public static void main(String[] args) {
        try{
            int data=25/5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic exception occurs");
        }
        finally{System.err.println("hello there");}
        System.out.println("rest of the code");
    }
    
}
