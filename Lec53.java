abstract class Parent{
   abstract public void greet();

}
class Child extends Parent{
    public void greet (){
        System.out.println("Good Morning");
    }
}
class Child2 extends Parent{
    public void greet (){
        System.out.println("Good Night");
    }
}
 abstract class Child3 extends Parent { // if you want a new subclass of paretn without inherit greet method you can make this class abstract
   
}
public class Lec53 {
    public static void main(String[] args) {
        Child sagar = new Child();
        Child2 pinki = new Child2();
      
        sagar.greet();
        pinki.greet();
    }
     
}
