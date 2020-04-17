import java.io.IOException;
public class checked_propogation {
    void fun1() throws IOException{
        throw new  IOException("error");
    }
    void fun2() throws IOException{
        fun1(); //exception not handled
        //exception propogated to fun3()
    }
    void fun3(){
        try{
            fun2();//exception handled
        }
        catch(Exception e){System.out.println("Exception handled");
    }}
    
      public static void main(String args[]){
          exception_prpogation obj =new exception_prpogation();
          obj.fun3();
          System.out.println("rest of the code");
      }
}
