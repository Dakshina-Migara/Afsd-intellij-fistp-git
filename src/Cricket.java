import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] score = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.print("enter the score of " + i + " player: ");
            score[i] = scan.nextInt();
        }
        double totalScore = 0;
        for (int a = 0; a < 11; a++) {
            totalScore += score[a];
        }
        System.out.println("Average score of a player: " + (totalScore /11));

        int highScore = score[0];
        int maxScore =0;
        for (int b = 0; b < 11; b++) {
            if (score[b] > highScore) {
                highScore = score[b];
                maxScore = b;
            }
        }
        System.out.println("Highest Score is " + highScore);
    }
}
