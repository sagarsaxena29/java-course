// Game chosse number
import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int input;
    public int noofGue=0;  
    
    public int getNoofGue() {
        return noofGue;
    }


    public void setNoofGue(int noofGue) {
        this.noofGue = noofGue;
    }


     Game(){
        Random computer = new Random();
        this.number = computer.nextInt(100);

        
    }
    void takeinput(){

    System.out.println("choose the Number: ");
    Scanner sc = new Scanner(System.in);
    input = sc.nextInt();
    }
    
    boolean isCorrectNumber(){
        noofGue++;
        if (input == number){
            System.out.format("Yes you guess it Right , it was %d\n you guessed it in %d attemps", number,noofGue);
            return true;
        }
        else if(input< number){
            System.out.println("too low");
        }
        else if(input > number){
            System.out.println("too high");
        }
        
        return false;

    }

    

}

public class Lec43 {
    public static void main(String[] args) {
        
 
    Game g = new Game();
    boolean b = false;
    while(!b){
    g.takeinput();
    b =g.isCorrectNumber();
    

    }

}
}