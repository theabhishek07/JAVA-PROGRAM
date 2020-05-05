import java.io.FileOutputStream;
import java.io.IOException;
public class file_output {
    public static void main(String[] args) {
        try{
            FileOutputStream fout= new FileOutputStream("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
            String s="This a is java guide";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("over");
        } catch(IOException e){System.out.println(e);
                
    }
    }
}
