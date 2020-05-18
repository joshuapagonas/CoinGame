package coingame;
import java.util.*;
public class CoinGame{
	
    public static void main(String[] args){
    	
        int turnCounter = 0;
        Scanner input = new Scanner(System.in);
        Table table = new Table();
        
        coinSetup(table);
        
        while(table.length() > 1){
        	
           turn(turnCounter);
           int choice = input.nextInt();
           if(choice == 3 || choice == 2 || choice == 1){
        	   
               if(table.length() == 3 && choice == 3){
            	   
                   System.out.println("You entered in the wrong number. I inputed the right number for you.");
                   choice = 2;
               }
               if(table.length() == 2 && choice == 2){
            	   
                   System.out.println("You entered in the wrong number. I inputed the right number for you.");
                   choice = 1;
               }
               for(int i = 0; i < choice; i++){
                   table.removeCoin(0);
               }
               System.out.println(table);
           }
        
           else{
        	   
               System.err.println("Pick an actual legal number next time You're turn is skipped. ");
           }
           turnCounter++;
        }
        
        Scanner i = new Scanner(System.in);
        if(turnCounter % 2 == 0 && table.length() == 1){
        	
            String s;
            System.out.println("Player One you must take the red coin. Type 1 now:");
            int c = input.nextInt();
            if(c != 1){
            	
                c = 1;
                System.out.println("If you won't coroperate, then I'll do it for you! Player One chose 1 ");
            }
            System.out.println("Player One took the red coin. Player Two WINS! ");
        }
        if(turnCounter % 2 == 1 && table.length() == 1){
        	
            String s;
            System.out.println("Player Two you must take the red coin. Type 1 now:");
            int ch = input.nextInt();
            if(ch != 1){
            	
                ch = 1;
                System.out.println("If you won't coroperate, then I'll do it for you! Player Two chose 1.");
            }
            System.out.println("Player Two took the red coin. Player One WINS!");
        }
    }
    
    public static void coinSetup(Table table){
        CoinObj c1 = new CoinObj("Silver");
        table.addCoin(c1);
        
        CoinObj c2 = new CoinObj("Silver");
        table.addCoin(c2);
        
        CoinObj c3 = new CoinObj("Silver");
        table.addCoin(c3);
        
        CoinObj c4 = new CoinObj("Silver");
        table.addCoin(c4);
        
        CoinObj c5 = new CoinObj("Silver");
        table.addCoin(c5);
        
        CoinObj c6 = new CoinObj("Silver");
        table.addCoin(c6);
        
        CoinObj c7 = new CoinObj("Silver");
        table.addCoin(c7);
        
        CoinObj c8 = new CoinObj("Silver");
        table.addCoin(c8);
        
        CoinObj c9 = new CoinObj("Silver");
        table.addCoin(c9);
        
        CoinObj c10 = new CoinObj("Silver");
        table.addCoin(c10);
        
        CoinObj c11 = new CoinObj("Silver");
        table.addCoin(c11);
        
        CoinObj c12 = new CoinObj("Silver");
        table.addCoin(c12);
        
        CoinObj c13 = new CoinObj("Silver");
        table.addCoin(c13);
        
        CoinObj c14 = new CoinObj("Silver");
        table.addCoin(c14);
        
        CoinObj c15 = new CoinObj("Red");
        table.addCoin(c15);
        
        System.out.println(table);
    }
    
    public static void turn(int turnCounter){
    	
        if(turnCounter % 2 == 1){
        	
            System.out.println("Player two's turn .");
            System.out.println("Choose one, two, or three coins to take. ");
        }
        else{
        	
            System.out.println("Player one's turn .");
            System.out.println("Choose one, two, or three coins to take. ");
        }
    }
}