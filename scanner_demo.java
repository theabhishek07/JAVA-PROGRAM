import java.util.Scanner;//import scanner class
public class scanner_demo {
    public static void main(String[] args) {
       //make object of scanner class
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();//input of a string
        char gender=sc.next().charAt(0);//input of a char
        int age=sc.nextInt();//input of a int
        long mobileNo=sc.nextLong();//input of a long int
        System.out.println("Name:" +name);
        System.out.println("gender:" +gender);
        System.out.println("age:" +age);
        System.out.println("mobile no:" +mobileNo);
        
    }
}
