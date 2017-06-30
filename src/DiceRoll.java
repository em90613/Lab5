import java.util.Scanner;
import java.util.Random;

public class DiceRoll {

    public static void DiceGen(int counter) {

        int sideDice;

        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();


        System.out.println("How many sides should each dice have?");
        sideDice = scnr.nextInt();

        System.out.println("Roll " + counter + ": ");
        System.out.println(randGen.nextInt(sideDice));
        System.out.println(randGen.nextInt(sideDice));
    }

    public static void main(String[] args) {

        String choice = "y";
        Scanner scnr = new Scanner(System.in);
        int rollCount = 1;

        System.out.println("Welcome to Grand Circus Casino!");
        System.out.println("");

        while (choice.equalsIgnoreCase("y")) {

            DiceGen(rollCount);

            System.out.println("");
            System.out.println("Roll again? y/n");
            choice = scnr.next();

            rollCount++;
        }
        System.out.println("Thanks for playing.");
    }
}


