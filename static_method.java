//A static method can access static data member and can change the value of it
class Student{
    String name;
    int roll_no ;
    static String college="UPES"; //static variable

static void change(){
college="new";//static method
}
Student(int r,String n){
roll_no=r;
name=n;
}
void display(){
    System.out.println(roll_no+" "+name+" "+college);  
}}
public class static_method {
    public static void main(String[] args) {
        Student s1=new Student(05,"ABHISHEK");
        //s1.display (this will print upes)
        //s1.change(); invoking static method using object
        Student.change();//invoking without object
        s1.display();
    }
}
