class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }     
    public void run(){
        while(true){
           System.out.println("i am a Thread" +this.getName());
         }
    }
}
public class Lec74 {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("sagar1");
         Mythr1 t2 = new Mythr1("sagar2");
          Mythr1 t3 = new Mythr1("sagar3");
           Mythr1 t4 = new Mythr1("sagar4");
            Mythr1 t5 = new Mythr1("sagar5(most imporatant)");
            t5.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();

    }
    
    
}
