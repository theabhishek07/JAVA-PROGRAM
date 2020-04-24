public class thread4 extends Thread{
    public void run(){
        System.out.println("running the thread");
    }
    public static void main(String[] args) {
        thread4 t1=new thread4();
        thread4 t2=new thread4();
        System.out.println("thread 1 name by default is:"+ t1.getName());
        System.out.println("thread 2 name by default is:"+ t2.getName());
        t1.start();
        t2.start();
        
        t1.setName("Abhishek");
        System.out.println("new name of thread1 is:"+ t1.getName());
    }
    
}
