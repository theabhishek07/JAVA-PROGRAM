 class student
 {
    int id;
    String name;
    
}
  public class object1
  {
     public static void main(String[] args)
     {
      //creating object of the class student
     student s1 = new student();
     student s2 = new student();
     //initializing object through reference
     s1.id=101;
     s1.name="abhishek";
     s2.id=106;
     s2.name="ram";
     //print object
         System.out.println(s1.id+ "  "+s1.name);
         System.out.println(s2.id+ "  "+s2.name);
     
     } 
}
