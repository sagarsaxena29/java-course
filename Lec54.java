interface Bicycle{
    void applybreak(int decreament);
    void speedup(int increament);
}
class Avon implements Bicycle{
    void Light(){
        System.out.println(" Lights On ");
    }
    public void applybreak(int decreament){
        System.out.println("Applying Break");
    }
    public void speedup(int increament){
        System.out.println("Applying speed");
    }
}
public class Lec54 {
    public static void main(String[] args) {
        Avon A = new Avon();
        A.applybreak(7);
    }
}
