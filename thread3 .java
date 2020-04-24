class thread3 extends Thread{  
 public void run(){  
  for(int i=1;i<=10;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println("hehe");}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 thread3 t1=new thread3();  
 thread3 t2=new thread3();
 thread3 t3=new thread3();
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();  
 }  
}  
