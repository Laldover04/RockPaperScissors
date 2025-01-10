import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String playerMove;
        int losses = 0;

        while (true) {
            System.out.println("Enter your move (r, p, or s)");
            playerMove = scanner.nextLine();

            // Computer is thinking
            for (int i = 0; i < 3; i++) {
                System.out.print(". ");

                try {
                    // sleep for .3 seconds
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // handle interrupted exception if needed
                    System.out.println("error!!!");
                    e.printStackTrace();
                }
            }

            // Computer decides to cheat
            if (playerMove.equals("r")) {
                System.out.println("Computer plays paper!");
            } else if (playerMove.equals("p")) {
                System.out.println("Computer plays scissors!");
            } else if (playerMove.equals("s")) {
                System.out.println("Computer plays rock!");
            } else {
                System.out.println("That wasn't one of the options... Cheating isn't allowed.");
            }

            losses++;
            System.out.println("You lose! Enter y to play again, anything else to exit.");
            playerMove = scanner.nextLine();
            if (!playerMove.equals("y")) {
                break;
            }

            // Rub score in players face
            System.out.println("\nScore 0 - " + losses);
        }

        // Rub score in players face for the last time
        System.out.println(
                "Thanks for playing, 0 wins, " + losses + " losses. Looks like you could use some practice...");

    }
}