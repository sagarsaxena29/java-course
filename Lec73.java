class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }

        public void run(){
            int i = 0;
    
        while(i<50){
            System.out.println("I am a thread");
            i++;
        }
    }

}
public class Lec73 {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("sagar");
        Mythr t2 = new Mythr("Pankaj");
         t1.start();
         t2.start();
        System.out.println("id of thread "+t1.getId());
        System.out.println("name of thread "+ t1.getName());
        System.out.println("id of thread "+t2.getId());
        System.out.println("name of thread "+ t2.getName());
       
    }
}
