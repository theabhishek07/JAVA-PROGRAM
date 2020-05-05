import java.io.*;
public class writer_example {
    public static void main(String[] args) {
        try{
            Writer w=new FileWriter("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
            String content="javajavajava";
            w.write(content);
            w.close();
            System.out.println("done");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
