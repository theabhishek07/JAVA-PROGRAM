import java.io.*;
public class buffered_writer
{
    public static void main(String[] args) throws Exception
    {
        FileWriter writerss=new FileWriter("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
        BufferedWriter buff=new BufferedWriter(writerss);
        buff.write("HELLO CODERS");
        buff.close();
        System.out.println("done");
    }   
}
