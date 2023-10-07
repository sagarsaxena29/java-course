class A {
    public void first(){
         System.out.println(" i am a first method for class A");
    }
}
class B extends A{
     public void first(){
        System.out.println("i am a first method for class B");
     }
    }
    

public class Lec48 {
 public static void main(String[] args) {
    A obj = new A();
    obj.first();
    B b = new B();
    b.first();
}   
}
