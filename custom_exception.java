class myException extends Exception{
    public myException(String s){
        super(s);
    }
}
public class custom_exception {
    public static void main(String[] args) {
        try{
            throw new myException("exceptionsss");
        }
        catch(myException ex){
            System.out.println("caught");
               System.out.println(ex.getMessage());
        }
       
    }
    
}
