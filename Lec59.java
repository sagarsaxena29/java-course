interface Mycamera{
    void Recordvideo();
    void TakeSnap();
    default void Record4K(){
        System.out.println("Record in 4K...");
    }
}
interface MyWifi{
    String[] getNeworks();
    void connnectToNetwork(String network);
}
class MYCellPhone {
    void callNumber(int phoneNumber){
        System.out.println("callling..."+phoneNumber);
    }
    void pickCall(){}
}
class MySmartphone extends MYCellPhone implements Mycamera , MyWifi{
    public void Recordvideo(){
        System.out.println("Recording.....start");
    }
    public void TakeSnap(){
        System.out.println("Taking snap...");
    }
    public  String[] getNeworks(){
        System.out.println("networks are.... ");
        String [] networkList = {"Airtel 4G" ," Jio 5G "};
        return networkList;
    }
    public void connnectToNetwork(String network){
        System.out.println("Connecting to network....."+network);
    }
}

public class Lec59 {
    public static void main(String[] args) {
        MyWifi obj = new MySmartphone();
        obj.connnectToNetwork("BSNL");
        String [] a = obj.getNeworks();
        for (String item : a){
            System.out.println(item);
        }
       
    }
    
}
