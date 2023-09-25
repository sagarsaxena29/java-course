//  Welcome to stone paper sizer Game  

import java.util.Random;
import java.util.Scanner;

public class Lec41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("select 0 for Stone / 1 for sizer / 2 for paper");
        int userInput = sc.nextInt();
        
        Random random = new Random();
        int computerInput = random.nextInt(3);
        
       if(userInput == computerInput){
        System.out.println("Draw");
       }
        else if(userInput == 0 && computerInput==1 || userInput ==1 && computerInput ==2 
        || userInput==2 && computerInput == 0){
            System.out.println("You won");
        }
        else  {
            System.out.println("You lose");
        }
        System.out.println("Computer Choose "+ computerInput);
    }
}

// Finsish Game