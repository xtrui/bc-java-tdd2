package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int guessChance = 6;
        GuessNumberGame guessNumberGame = new GuessNumberGame(new GenerateAnswerImpl());
        while (guessChance != 0) {
            System.out.println("please input !");
            Scanner scanner = new Scanner(System.in);
            String guess = scanner.next();
            if (!ValidTool.isValid(guess)) {
                System.out.println("Wrong Input，Input again.");
                guessChance--;
                continue;
            }
            String result = guessNumberGame.guess(guess);
            System.out.println(result);
            guessChance--;
        }
    }
}
