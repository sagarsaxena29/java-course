class Mythread1 extends Thread{
    public void run(){
        int i=0;
       while(i<5000){
        System.out.println("Cooking Thread.......");
         i++;
    }}
}
class Mythread2 extends Thread{
    public void run(){
        int i =0;
       while(i<5000){
        System.out.println("Chatting Thread.......");
       i++;
    }}
}
public class Lec71 {
    public static void main(String[] args) {
        Mythread1 T1 = new Mythread1();
    Mythread2 T2 = new Mythread2();
    T1.start();
    T2.start(); 

    }
    
}
