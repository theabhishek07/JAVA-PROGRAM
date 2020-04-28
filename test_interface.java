interface bank{
 float rate_of_intrest();
 }
class AXIS implements bank{
    public float rate_of_intrest(){
        return 9.4f;
    }
}
class OBC implements bank{
public float rate_of_intrest(){
    return 9.6f;
}
}

public class test_interface {
    public static void main(String[] args) {
        bank obj1=new AXIS();
        System.out.println(obj1.rate_of_intrest());
    }
    
}
