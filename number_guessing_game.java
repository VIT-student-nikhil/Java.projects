import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);
        System.out.println("Number guessing game");
        System.out.println("Gues a number between 1-10");
        do {
            System.out.print("Enter a guess");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber)
            {
                System.out.println("Too low!try again");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high!try again");
            }
            else
            {
                System.out.println("Correct!the number was " + randomNumber);
                System.out.println("# no of attempts: " + attempts);
            }
            
                
            
        } while (guess != randomNumber);
        scanner.close();


    }
}
