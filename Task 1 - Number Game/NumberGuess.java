import java.util.*;
public class NumberGuess{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int roundsWon = 0;
        System.out.println("WELCOME TO THE GUESS THE NUMBER GAME");
        System.out.println("....................................");
        boolean restart = true;
        while(restart){
            int leastBound = 1;
            int highBound = 100;
            int randNumber = rand.nextInt(highBound - leastBound +1)+leastBound;
            int remainAttempts = 6;
            System.out.println("Picked a secret number b/w  between " + leastBound + " and " + highBound + ".");
            System.out.println("You have " + remainAttempts + " chances to crack!");
            boolean correctGuess = false;
            while(remainAttempts > 0){
                System.out.print("Enter the no. you guessed: ");
                int playerGuess = sc.nextInt();
                remainAttempts --;
                if(playerGuess<randNumber){
                    System.out.println("Your guess is small!!");    
                }
                else if(playerGuess>randNumber){
                    System.out.println("Your guess is high!!");
                }
                else{
                    correctGuess = true;
                    roundsWon++;
                    System.out.println("YOU NAILED IT!!");
                    System.out.println("Attempts taken:" + (6-remainAttempts));
                    break;
                }
                if(remainAttempts>0){
                    System.out.println("Remaining Attempts : " + remainAttempts);
                }
                else{
                    System.out.println("Ypu are out of tries!! The exact no. is " + randNumber);
                }
            }
            System.out.println("Wanna Play once more ? (yea/nah): ");
            String userResponse = sc.next();
            if(!userResponse.toLowerCase().equals("YES")){
                restart = false;
                System.out.println("Challenge Over ! You have won : " + roundsWon);
            }
            
        }

    }

}