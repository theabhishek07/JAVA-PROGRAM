class over{
    void fun(){
        System.out.println("2020 over");
    }
}
public class overriding extends over {
    void fun(){
        System.out.println("welcome COVID-19");
    }
    public static void main(String[] args) {
        overriding obj=new overriding();
        over obj1 =new over();
        obj.fun();
        obj1.fun();
    }
    
}
