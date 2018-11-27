package scrabble;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class scrabbleCheater {
    public static void main(String[] args) {
        searchTiles();
    }

    public static String currentTiles;

    public static void beginningTiles(){
        Input input = new Input();
        currentTiles = input.getString("Please enter your beginning tiles");
    }

    public static void setCurrentTiles(){
        Input input = new Input();
        String tilesToRemove = input.getString("What was your last play?");
        String replaceTiles = input.getString("What are your replacement tiles?");
        if (!currentTiles.contains(tilesToRemove)){
            System.out.println("Tiles to remove must be included in current tiles");
            setCurrentTiles();
        }
        for (int i = 0; i < tilesToRemove.length(); i++){
            currentTiles = currentTiles.replace(tilesToRemove.charAt(i), replaceTiles.charAt(i));
        }
    }

    public static void searchTiles(){
        Input input = new Input();
        boolean stopPlaying = false;
        beginningTiles();
        do {
            checkWords(getWords(), currentTiles);
            stopPlaying = input.yesNO("Stop Playing? [y/n]");
            if (!stopPlaying){
                setCurrentTiles();
            }
        }while (!stopPlaying);
    }

    public static List<String> getWords(){
        Path filePath = Paths.get("src/scrabble/scrabble.txt");
        List<String> addedList = new ArrayList<>();
        try {
            addedList = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return addedList;
    }

    public static void checkWords(List<String> words, String tile){
        String tempTiles;
        for (String word : words){
            tempTiles = tile;
            Boolean soutLetter = true;
            for(int i = 0; i < word.length(); i++){
                String letter = Character.toString(word.charAt(i));
                if (!tempTiles.contains(letter)){
                    soutLetter = false;
                }else {
                    tempTiles = tempTiles.replace(letter, "1");
                }
            }
            if (soutLetter && word.length() <= tile.length()){
                System.out.println(word);
            }
        }
    }
}
