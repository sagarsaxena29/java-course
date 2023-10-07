class Ekclass{
    int a ;
    public int getA() {
        return a;
    }
    public int returnone(){
        return 1;
    }
    Ekclass (int a){
        this.a = a;
    }
}
    class Doclass extends Ekclass{
        
        Doclass (int c){
            super(c);
            System.out.println("i am a constructor");
        }

        
         
    }
public class Lec46 {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        Doclass d = new Doclass(055);
        System.out.println(e.getA());
    }
    
}
