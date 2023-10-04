class base{
    int x;
    
public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
     public void println(){
        System.out.println("I am a constuctor");
    
}
}
class Derived extends base{
    int v;
    
    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
    
}
   
public class Lec45 {
public static void main(String[] args) {
    base b = new base();
    b.setX(10);
    System.out.println(b.getX());
}
}
