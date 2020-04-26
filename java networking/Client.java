//making the client
//read-write only one side
import java.io.*;
import java.net.*;
public class Client{
public static void main (String args [])
{
try{
Socket s=new Socket("localhost",6666);//using localhost 
DataOutputStream dout=new DataOutputStream(s.getOutputStream());//inputing the data
dout.writeUTF("hello dear");
dout.flush();
dout.close();
s.close();
}catch(Exception e){
System.out.println(e);
}}}
