public class constructor {
    int roll;
    String name;
    int age;
  constructor(int r , String n)
 {
     roll=r;
     name=n;
 }
 constructor(int r, String n, int a)
 {
     roll=r;
     name=n;
     age=a;
 }
 void display(){
 System.out.println(roll+ " "+name+" "+ age);
}
    public static void main(String[] args) {
        constructor s1 = new constructor(101,"Sharma");
        constructor s2 = new constructor(106,"Abhishek",19);
        s1.display();
        s2.display();
    }
}
