public class thread2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        {
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println("Hello");
            }
            System.out.println(i);
        }
        
    }
    public static void main(String[] args) {
        thread2 t1=new thread2();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
