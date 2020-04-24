public class thread5 extends Thread {
    public void run()
    {
        System.out.println("running thread name is"+ Thread.currentThread().getName());
         System.out.println("running thread priority is"+ Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        thread5 m1= new thread5();
        thread5 m2=new thread5();
        m2.start();
        m1.start();
        m2.setPriority(MIN_PRIORITY);
        m1.setPriority(MAX_PRIORITY);
    }
    
}
