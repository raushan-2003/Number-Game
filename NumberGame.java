import java.util.Scanner;

class NumberGame {
    public static void main(String args[]) {
        System.out.println("\n\n********************    WELCOME TO NUMBER GAME    ********************\n\n\n");

        System.out.println("Rules : \n");
        System.out.println("* You Have Total 3 Rounds");
        System.out.println("* You Have Total 5 Attempts In Each Rounds\n\n\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose The Number Between 1 to 100 : \n");

        int score = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n\n************************    Round " + i + "     ************************\n\n");

            int generatedNumber = (int) Math.floor((Math.random() * 100) + 1);

            
            for (int j = 1; j <= 5; j++) {
                System.out.print("Enter The Number : ");
                int guessNum = input.nextInt();

                if (guessNum == generatedNumber) {
                    score++;
                    System.out.println("\nYou Guess The Correct Number !");
                    System.out.println("__________________________________________________________________");
                    break;
                } else if (guessNum < generatedNumber) {
                    System.out.println("\nThe Guess Number Is Too Low");
                } else {
                    System.out.println("\nThe Guess Number Is Too High");
                }

                System.out.println("__________________________________________________________________\n");
            }

        }

        System.out.println("\n\nTotal Number Of Rounds : 3");
        System.out.println("Total Number of Attempts : 5");
        System.out.println("Your Score : " + score);

        if (score > 0) {
            System.out.println("\nCongratulations, You Won The Game....\n\n");
        } else {
            System.out.println("\nSorry, You Loss The Game....\n\n");
        }

        System.out.println("__________________________________________________________________");

        
        input.close();
    }
}