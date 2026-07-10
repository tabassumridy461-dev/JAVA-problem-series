import java.util.Scanner;

public class MemoryCardGame {

    static char[] cards = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D'};
    static boolean[] matched = new boolean[8];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pairsFound = 0;
        int moves = 0;

        while (pairsFound < 4) {

            displayBoard();

            System.out.print("Select first card (1-8): ");
            int first = input.nextInt() - 1;

            System.out.print("Select second card (1-8): ");
            int second = input.nextInt() - 1;

            if (first == second ||
                first < 0 || first > 7 ||
                second < 0 || second > 7 ||
                matched[first] ||
                matched[second]) {

                System.out.println("Invalid selection!");
                continue;
            }

            moves++;

            System.out.println("\nFirst Card : " + cards[first]);
            System.out.println("Second Card: " + cards[second]);

            if (cards[first] == cards[second]) {

                System.out.println("Match Found!");

                matched[first] = true;
                matched[second] = true;

                pairsFound++;

            } else {

                System.out.println("Not a Match.");
            }
        }

        System.out.println("\nCongratulations!");
        System.out.println("You matched all pairs.");
        System.out.println("Total Moves: " + moves);

        input.close();
    }

    static void displayBoard() {

        System.out.println("\n===== Memory Board =====");

        for (int i = 0; i < cards.length; i++) {

            if (matched[i]) {
                System.out.print(" " + cards[i] + " ");
            } else {
                System.out.print(" " + (i + 1) + " ");
            }
        }

        System.out.println();
    }
}
