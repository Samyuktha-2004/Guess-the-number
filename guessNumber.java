import java.util.*;

class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int guesses = 1;
        System.out.print("Guess the number (between 0-99): ");
        int n = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Hint: The hidden number is an even number.");
        } else {
            System.out.println("Hint: The hidden number is an odd number.");
        }
        for (int i = 2; i <= 12; i++) {
            if (number % i == 0) {
                System.out.println("Hint: The hidden number is divisible by " + i);
            }
        }
        System.out.println("Hint: The hidden number is not divisible by any other number between 2 and 12.");
        while (n != number) {
            if (n < number) {
                System.out.println("Try a bigger number.");
            } else {
                System.out.println("Try a smaller number.");
            }
            System.out.print("Guess the number again: ");
            n = sc.nextInt();
            guesses++;
        }
        System.out.println("Congratulations! You guessed the number in " + guesses + " attempts.");
        if (guesses <= 2) {
            System.out.println("Your IQ grade is A++");
        } else if (guesses <= 5) {
            System.out.println("Your IQ grade is A");
        } else if (guesses <= 10) {
            System.out.println("Your IQ grade is B");
        } else {
            System.out.println("Your IQ grade is C");
        }
        System.out.println("Keep solving more puzzles to improve.");
        System.out.println("******** Thank you for playing! ********");
    }
}
