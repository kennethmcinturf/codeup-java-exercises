import java.util.Arrays;

public class ServerNameGenerator {
    public static String randomString(String[] strings){
        int random = (int) (Math.random() * strings.length);
        return strings[random];
    }


    public static void main(String[] args) {
        String[] adjectives = {"aggreeable","beautiful","loving","kindly","angry","hateful","chuby","ancient","boiling","numerous"};
        String[] nouns = {"school","home","office","store","mall","bank","church","ufo","tomb","codeup"};
        String adjective = randomString(adjectives);
        String noun = randomString(nouns);
        System.out.println("Here is your server name: \n");
        System.out.println(adjective + "-" + noun);
    }
}
