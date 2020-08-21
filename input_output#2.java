import java.io.FileInputStream;
import java.io.IOException; 
public class file_input
{
    public static void main(String[] args)
    {
        try{
        FileInputStream fin= new FileInputStream("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
        int i=0;
         while((i=fin.read())!=-1)
         {
            System.out.println((char)i);
            }
        fin.close();
        }
            catch( IOException e)
            {
                    System.out.println(e);
                    }
        
    }
}
