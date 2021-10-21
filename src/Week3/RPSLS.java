package Week3;

import java.util.Random;
import java.util.Scanner;

public class RPSLS {

    public static void main(String[] args) {

        //SHOW GAME----------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        //Q1
        System.out.println("Welcome to the R P S L SP game,");
        System.out.println("First, do you know what RPSLS stands for? (yes or no)");
        String answerone = scanner.nextLine();

        boolean t = answerone.equals("yes");
        boolean survived = false;

        if (t) {
            System.out.println("Ok let's continue");
        }
        if (!t) {
            if (answerone.equals("no")) {
                System.out.println("It stands for Rock Paper Scissors Lizard and Spock");
            } else if (!answerone.equals("no")) {
                while (!answerone.equals("no") && !answerone.equals("yes")) {
                    System.out.println("Please answer");
                    answerone = scanner.nextLine();
                }
                survived = true;
            }
        }

        if (answerone.equals("yes") && survived) {
            System.out.println("Ok let's continue");
        }
        if (answerone.equals("no") && survived) {
            System.out.println("It stands for Rock Paper Scissors Lizard and Spock");
        }


        //Q2
        System.out.println("Do you know the rules of R P S L SP");
        String answertwo = scanner.nextLine();

        boolean t2 = answertwo.equals("yes");
        boolean survived2 = false;

        if (t2) {
            System.out.println("Alright then let's start,");
        }
        if (!t2) {
            if (answertwo.equals("no")) {
                System.out.println("The rules are quite simple,");
                System.out.println("Scissors cuts paper, paper covers rock, rock crushes lizard,");
                System.out.println("Scissors cuts paper, paper covers rock, rock crushes lizard,");
                System.out.println("lizard poisons Spock, Spock smashes scissors,scissors decapitates lizard,");
                System.out.println("lizard eats paper, paper disproves Spock, Spock vaporizes rock,");
                System.out.println("and as it always has, rock crushes scissors");
            } else if (!answertwo.equals("no")) {
                while ((!answertwo.equals("no")) && (!answertwo.equals("yes"))) {
                    System.out.println("Please reconsider your answer");
                    answertwo = scanner.nextLine();
                }
                survived2 = true;
            }
        }

        if (answertwo.equals("yes") && survived2) {
            System.out.println("Alright then let's start,");
        }
        if (answertwo.equals("no") && survived2) {
            System.out.println("The rules are quite simple,");
            System.out.println("Scissors cuts paper, paper covers rock, rock crushes lizard,");
            System.out.println("Scissors cuts paper, paper covers rock, rock crushes lizard,");
            System.out.println("lizard poisons Spock, Spock smashes scissors,scissors decapitates lizard,");
            System.out.println("lizard eats paper, paper disproves Spock, Spock vaporizes rock,");
            System.out.println("and as it always has, rock crushes scissors");
        }

        System.out.println("Now choose an input between R-P-S-L-SP ");

        //USER INPUT---------------------------------------------------------------

        String HChoice = scanner.nextLine();
        HChoice = HChoice.toUpperCase();

        while (!HChoice.equals("R") && !HChoice.equals("P") && !HChoice.equals("S") && !HChoice.equals("L") && !HChoice.equals("SP")) {
            System.out.println("Choose a valid input");
            HChoice = scanner.nextLine();
            HChoice = HChoice.toUpperCase();
        }

        System.out.println("You chose " + "\"" + HChoice + "\"");

        //COMPUPER INPUT-----------------------------------------------------------

        Random random = new Random();
        int z = random.nextInt(5) + 1;
        String CChoice = "";

        if (z == 1) {
            CChoice = "R";
        }
        if (z == 2) {
            CChoice = "P";
        }
        if (z == 3) {
            CChoice = "S";
        }
        if (z == 4) {
            CChoice = "L";
        }
        if (z == 5) {
            CChoice = "SP";
        }

        System.out.println("And the computer chose " + "\"" + CChoice + "\"");

        //COMPARE INPUTS-----------------------------------------------------------

        if (CChoice.equals(HChoice)) {
            System.out.println("We both won,nice");
        } else if (HChoice.equals("P") && (!CChoice.equals("R") || !CChoice.equals("SP"))) {

            System.out.println("You lost ahaha");
        } else if (HChoice.equals("P") && (CChoice.equals("R") || CChoice.equals("SP"))) {

            System.out.println("You won :( ");
        } else if (HChoice.equals("R") && (!CChoice.equals("L") || !CChoice.equals("S"))) {

            System.out.println("You lost ahaha");
        } else if (HChoice.equals("R") && (CChoice.equals("L") || CChoice.equals("S"))) {

            System.out.println("You won :( ");
        } else if (HChoice.equals("L") && (!CChoice.equals("P") || !CChoice.equals("SP"))) {

            System.out.println("You lost ahaha");
        } else if (HChoice.equals("L") && (CChoice.equals("P") || CChoice.equals("SP"))) {

            System.out.println("You won :( ");
        } else if (HChoice.equals("SP") && (!CChoice.equals("R") || !CChoice.equals("S"))) {

            System.out.println("You lost ahaha");
        } else if (HChoice.equals("SP") && (CChoice.equals("R") || CChoice.equals("S"))) {

            System.out.println("You won :( ");
        } else if (HChoice.equals("S") && (!CChoice.equals("P") || !CChoice.equals("L"))) {

            System.out.println("You lost ahaha");
        } else if (HChoice.equals("S") && (CChoice.equals("L") || CChoice.equals("P"))) {

            System.out.println("You won :( ");
        }


    }
}
