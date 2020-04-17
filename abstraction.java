abstract class shape{
abstract void draw();
}
class rectangle extends shape{
    void draw(){
        System.out.println("rectanle is drawn");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("circle is drawn");
    }
}

public class abstraction {
    public static void main(String[] args) {
        shape s1=new circle();
        s1.draw();
    }
    
}
