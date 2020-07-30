import java.io.*;
public class reader_example 
{
    public static void main(String[] args) 
    {
        try{
            Reader reader=new FileReader("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
            int data=reader.read();
            while(data!=-1){
                 System.out.println((char)data);
                data=reader.read();
                        
                
            }
            reader.close();
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
