import util.Input;

import java.util.ArrayList;
import java.util.Random;


public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("Welcome to The Game of Games!!");
        Boolean continuePlaying = false;
        Input input2 = new Input();
        do {
            playRockPaperScissor();
            continuePlaying = input2.yesNO("Continue Playing?");
        }while (continuePlaying);
        System.out.println("That was fun, come back soon!!");
    }
    public static void playRockPaperScissor(){
        Random generator=new Random();
        Boolean playerWin = false;
        Boolean playerLose = false;
        Input input = new Input();
        String playGame = input.getString("Please Enter a play");
        int computerMove = generator.nextInt(3) + 1;
        computerResult(computerMove);
        if (playGame.toLowerCase().equals("rock")){
            if (computerMove == 1){
                System.out.println("You win!");
                playerWin = true;
            }else if(computerMove == 2){
                System.out.println("You tied, no winner!");
            }else if(computerMove == 3){
                System.out.println("You lose!");
                playerLose = true;
            }
        }else if (playGame.toLowerCase().equals("scissor")){
            if (computerMove == 1){
                System.out.println("You tied, no winner!");
            }else if(computerMove == 2){
                System.out.println("You lose!");
                playerLose = true;
            }else if(computerMove == 3){
                System.out.println("You win!");
                playerWin = true;
            }
        }else if (playGame.toLowerCase().equals("paper")){
            if (computerMove == 1){
                System.out.println("You lose!");
                playerLose = true;
            }else if(computerMove == 2){
                System.out.println("You win!");
                playerWin = true;
            }else if(computerMove == 3){
                System.out.println("You tied, no winner!");
            }
        }else{
            System.out.println("Please enter a valid input ie rock,paper, or scissors");
            playRockPaperScissor();
        }
        reults(playerWin,playerLose);
        System.out.println("The current record is Player: " + winnerList.size() + " Computer: " + loserList.size());
    }

    public static void computerResult(double computerMove){
        if (computerMove == 1){
            System.out.println("Computer did scissor");
        }else if(computerMove == 2){
            System.out.println("Computer did Rock");
        }else{
            System.out.println("Computer shot Paper");
        }
    }

    public static void reults(Boolean winner, Boolean loser){
        if (winner){
            winnerList.add(1);
        }else if(loser){
            loserList.add(1);
        }
    }

    public static ArrayList<Integer> winnerList = new ArrayList<>();
    public static ArrayList<Integer> loserList = new ArrayList<>();
}
