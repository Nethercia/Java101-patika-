package java101;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rock_paper_scissors {
    public static void main(String[] args) throws InterruptedException {
        Scanner inp = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\n*****Welcome To Rock-Paper-Scissors Game*****");
        int myScore = 0;
        int pcScore = 0;

        while (true) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print("\n==========\n1- Rock " + "\n2- Paper \n3- Scissors \n===========\n0- Quit \nMake your decision : ");
            int playerSelect = inp.nextInt();
            int pcSelect = random.nextInt(3) + 1;
            TimeUnit.SECONDS.sleep(0);

            if (playerSelect == 0) {
                System.out.println("\n***Good bye***");
                TimeUnit.SECONDS.sleep(1);
                break;
            } else if (playerSelect == pcSelect) {
                System.out.println("\n****Draw****");
            } else if ((playerSelect == 2 && pcSelect == 1) ||
                    (playerSelect == 1 && pcSelect == 3) ||
                    (playerSelect == 3 && pcSelect == 2)) {
                System.out.println("\n***You Win***");
                myScore++;
            } else if ((playerSelect != 1) && (playerSelect != 2) && (playerSelect != 3)) {
                System.out.println("*Invalid Option*");
            } else {
                System.out.println("\n***Pc Wins***");
                pcScore++;
            }

        }
        if (myScore > pcScore){
            System.out.println("\n***You Won The Game***");
            System.out.println("Your Score : "+ myScore +"\nPc Score : "+ pcScore);
        }else if (myScore == pcScore){
            System.out.println("\n***Draw***");
            System.out.println("Your Score : "+ myScore +"\nPc Score : "+ pcScore);
        }else {
            System.out.println("\n***You Lost The Game***");
            System.out.println("Your Score : "+ myScore +"\nPc Score : "+ pcScore);
        }


    }
}
