//import util.Input;
//
//import java.util.Arrays;
//
//public class TicTacToe {
//    public static void main(String[] args) {
//        DrawBoard(createArray());
//       boolean isGameWon = false;
//       do {
//           playGame();
//       }while (isGameWon);
//    }
//    public static String[][] createArray(){
//        String[][] tictactoe = {
//                {"-","-","-"},
//                {"-","-","-"},
//                {"-","-","-"}
//        };
//        return tictactoe;
//    }
//    public static void DrawBoard(String[][] array){
//        String[][] tictactoeboardDrawn = array;
//        System.out.println("+-A-+-B-+-C-+");
//        for (int i = 0; i < 3; i++){
//            if (i == 0){
//                System.out.print("1 ");
//                for (int j = 0; j < 3; j++){
//                    System.out.print(tictactoeboardDrawn[0][j] + " | ");
//                }
//            }
//            if (i == 1){
//                System.out.print("\n2 ");
//                for (int j = 0; j < 3; j++){
//                    System.out.print(tictactoeboardDrawn[1][j] + " | ");
//                }
//            }
//            if (i == 2){
//                System.out.print("\n3 ");
//                for (int j = 0; j < 3; j++){
//                    System.out.print(tictactoeboardDrawn[2][j] + " | ");
//                }
//            }
//        }
//        System.out.println("\n+---+---+---+");
//    }
//    public static void playGame(){
//        String[][] tictactoeboard = createArray();
//        Input input = new Input();
//        boolean gameWon = false;
//        System.out.println("Moves are made by refrencing the grid onn the outside of the playing board");
//        int whoTurn = 1;
//        do {
//            if (whoTurn == 1){
//                System.out.println("Player X, please make a move");
//            }else{
//                System.out.println("Player Y, please make a move");
//            }
//            String playerMove = input.getString();
//            if (playerMove.startsWith("A")){
//                if (playerMove.endsWith("1")){
//                    if (whoTurn == 1){
//                        tictactoeboard[0][0] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[0][0] = "O";
//                        whoTurn = 1;
//                    }
//                }else if(playerMove.endsWith("2")){
//                    if (whoTurn == 1){
//                        tictactoeboard[0][1] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[0][1] = "O";
//                        whoTurn = 1;
//                    }
//                }else if(playerMove.endsWith("3")){
//                    if (whoTurn == 1){
//                        tictactoeboard[0][2] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[0][2] = "O";
//                        whoTurn = 1;
//                    }
//                }
//            }else if (playerMove.startsWith("B")){
//                if (playerMove.endsWith("1")){
//                    if (whoTurn == 1){
//                        tictactoeboard[1][0] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[1][0] = "O";
//                        whoTurn = 1;
//                    }
//                }else if(playerMove.endsWith("2")){
//                    if (whoTurn == 1){
//                        tictactoeboard[1][1] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[1][1] = "O";
//                        whoTurn = 1;
//                    }
//                }else if(playerMove.endsWith("3")){
//                    if (whoTurn == 1){
//                        tictactoeboard[1][2] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[1][2] = "O";
//                        whoTurn = 1;
//                    }
//                }
//            }else if (playerMove.startsWith("C")){
//                if (playerMove.endsWith("1")){
//                    if (whoTurn == 1){
//                        tictactoeboard[2][0] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[2][0] = "O";
//                        whoTurn = 1;
//                    }
//                }else if(playerMove.endsWith("2")){
//                    if (whoTurn == 1){
//                        tictactoeboard[2][1] = "X";
//                        whoTurn = 2;
//                    }else {
//                        tictactoeboard[2][1] = "O";
//                        whoTurn = 1;
//                    }
//                }else if(playerMove.endsWith("3")) {
//                    if (whoTurn == 1) {
//                        tictactoeboard[2][2] = "X";
//                        whoTurn = 2;
//                    } else {
//                        tictactoeboard[2][2] = "O";
//                        whoTurn = 1;
//                    }
//                }
//                if (tictactoeboard[0][1].equals(tictactoeboard[0][0]) && tictactoeboard[0][2].equals(tictactoeboard[0][0]))
//            DrawBoard(tictactoeboard);
//            gameWon = false;
//        }while (gameWon);
//        }}}
