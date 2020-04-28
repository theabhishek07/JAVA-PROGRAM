interface first{
    void first1();
    
}
interface second{
    void second2();
}
class test implements first,second{
    public void first1(){
        System.out.println("testing");
    }
    public void second2(){
        System.out.println("multiple");
    }
}
public class test_multiple {
    public static void main(String[] args) {
        test obj=new test();
        obj.first1();
        obj.second2();
    }
    
}
