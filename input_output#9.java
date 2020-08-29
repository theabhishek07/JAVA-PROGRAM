import java.io.*;
public class buffered_reader 
{
    public static void main(String[] args) throws Exception
    {
        FileReader rd=new FileReader("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
        BufferedReader br= new BufferedReader(rd);
         int i;
         while((i=br.read())!=-1){//read the text file till reaches end of file i.e -1
        System.out.println((char)i);
    }
         br.close();
         rd.close();
        
    }
    
}
