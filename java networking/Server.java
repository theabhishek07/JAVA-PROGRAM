//making server
//read-write only one side
import java.io.*;
import java.net.*;
public class Server{
public static void main (String args [])
{
try{
ServerSocket ss =new ServerSocket(6666);//using the local host post number
Socket s=ss.accept();
DataInputStream dis =new DataInputStream(s.getInputStream());//getting the data from client
String str =(String)dis.readUTF();//storing the data in string str
System.out.println("message is" + str);
ss.close();}
catch(Exception e){
System.out.println(e);
}
}}
