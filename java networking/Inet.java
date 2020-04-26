import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Inet {
    public static void main(String[] args)  {
        try{
              InetAddress ip= InetAddress.getByName("www.github.com");     
              System.out.println("host name: "+ ip.getHostName());
              System.out.println("ip address: "+ ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
