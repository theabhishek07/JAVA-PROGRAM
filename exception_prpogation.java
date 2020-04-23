public class exception_prpogation {
    void fun1(){
        int data=50/0; //exception occurs 
    }
    //exception prpogated to fun2()
    void fun2(){
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
