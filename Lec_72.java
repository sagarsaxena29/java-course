class MyThreadRunnable1 implements Runnable {
    public void run(){
        int i = 0;
        while(i<4300)
        {
        System.out.println("it is a thread 1");
        i++;
        }
    }
    
} 
class MyThreadRunnable2 implements Runnable {
    public void run(){
        int i = 0;
        while(i<4300)
        {
        System.out.println("it is a thread 2");
        i++;
        }
    }
    
} 
public class Lec_72 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 =new MyThreadRunnable1();
        Thread Gun1 = new Thread(bullet1);
        
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread Gun2 = new Thread(bullet2);
        Gun1.start();
        Gun2.start();
    }
    
}
