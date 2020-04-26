import java.net.*;
public class URL_example {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://github.com/theabhishek07/JAVA-PROGRAM/tree/master/java%20networking");
            System.out.println(url.getHost());//return the host name
            System.out.println(url.getProtocol());//return the protocol
            System.out.println(url.getPort());//return the port number if not mentioned return -1
            System.out.println(url.getFile());//return the file
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
