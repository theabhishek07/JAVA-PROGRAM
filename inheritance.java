class animal{
     void dog(){
         System.out.println("bark");
     }
 }
class water extends animal{
    void fish(){
        System.out.println("swim");
    }
}
class air extends water{
    void birds(){
        System.out.println("fly");
    }
}
public class inheritance {
    public static void main(String[] args) {
        air a1 =new air();
        a1.dog();
        a1.fish();
        a1.birds();
    }
    }
