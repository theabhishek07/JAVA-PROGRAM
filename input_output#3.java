import java.io.*;
public class buffred_outputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout=new FileOutputStream("C:\\Users\\ABHISHEK\\Documents\\NetBeansProjects\\practice\\target\\classes\\practice_java\\test.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
      byte b[]={75,76,77,78,79,80};
      bout.write(b);
      bout.flush();
      fout.close();
      bout.close();
    }
    
    
}
