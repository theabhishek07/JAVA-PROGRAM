class demo extends Thread
{
public  static void main(final String[] args)
{
Thread t=Thread.currentThread();
String s="O";
for(int i=0;i<500;i++)
{
try
{
System.out.println(s);
System.out.println("I AM THE GREAT : "+i+ "%");
//Thread.sleep(10);
new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
s=s+"K";
}catch(Exception e){
e.printStackTrace();
}
}
}
}
