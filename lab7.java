package Week3;
import java.util.Scanner;
public class lab7 {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Adventure game");
        System.out.println("You find yourself at a crossroads. Choose a path\n"
                + "1) Left: \n"
                + "2) Right: \n");

        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Welcome to left path");
            System.out.println("you encounter a river. What do you do\n"
                    + "1) . Cross the river: \n"
                    + "2) . Go around the river:\n ");
            int choiceLeft;

            choiceLeft = input.nextInt();

            if (choiceLeft == 1) {
                System.out.println("You swim across and continue your journey. \n Thank you for playing!");
            }

            else{
                System.out.println("You walk around and find a bridge. You cross and continue your journey. \n Thank you for playing");
            }

        }
        else{
            System.out.print("Welcome to right path");

            System.out.println("You find a cave. Do you\n"
                    + "1) Enter the cave:\n"
                    + "2) Continue walking past:\n ");

            int choiceRight;

            choiceRight = input.nextInt();
            if (choiceRight == 1) {
                System.out.println("You discover treasure inside the cave!\n Thank you for playing!");
            }
            else {
                System.out.println("You walk past and find a beautiful meadow.\n Thank you for playing!");
            }
        }
    }
}
