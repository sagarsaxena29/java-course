

interface BasicAnimal{
    void eat();
    void sleep();
}
    class Monkey { 
        void jump(){
            System.out.println("jumping....");
        }
        void Bite(){
            System.out.println("Biting....");
        }
    }

class Human extends Monkey implements BasicAnimal {
    void speak(){
        System.out.println("Hello");
    }
   public void eat(){
        System.out.println("Earing....");
    }
    public void sleep(){
        System.out.println("sleeping....");
    }
  

    

}




public class InterfaceExcercise {
    public static void main(String[] args) {
        Human M = new Human();
        M.sleep();
    }
}
