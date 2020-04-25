class student1{
    int roll;
    String subject;
    void insert (int r, String s){
        roll=r;
        subject=s;
    }
    void display(){
        System.out.println(roll+ " "+subject);
    }
    
}

public class object2 {
    public static void main(String[] args) {
        student1 s1 =new student1();
        student1 s2=new student1 ();
        s1.insert(106,"maths");
        s2.insert(110, "english");
        s1.display();
        s2.display();
    }
    
}
