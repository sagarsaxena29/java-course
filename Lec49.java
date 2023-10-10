//Dynamic Method Dispatch 

class phone{
    public void call(){
        System.out.println("Calling.......");
     }
    public void On(){
        System.out.println("Turning on phone.......");
    }
}
class smartphone extends phone{
    public void Music(){
        System.out.println("select a song");
    }
    public void On(){
        System.out.println("Turning on smartphone......");
    }
}
public class Lec49 {
    public static void main(String[] args) {
    phone obj = new smartphone();
        obj.call();
        obj.On();
}

}
