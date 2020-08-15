import java.io.*;
import java.net.*;
public class URL_connection 
{
    public static void main(String[] args)
    {
        try{
            URL url=new URL("https://github.com/theabhishek07/JAVA-PROGRAM/tree/master/java%20networking");
            URLConnection cn= url.openConnection();
            InputStream input= cn.getInputStream();//getting input from url
            int i;
            while((i=input.read())!=-1){//reading webpage till EOF
                System.out.println((char)i);//printing word by word
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
