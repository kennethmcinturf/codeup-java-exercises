import java.util.Scanner;

public class Bob {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        boolean continueTalk = true;
        do {
            System.out.println("Talk to Bob");
            String response = scanner.nextLine();
            if (response.endsWith("?")){
                System.out.println("Bob says: Sure");
            }else if (response.endsWith("!")){
                System.out.println("Bob says: Whoa, chill out!");
            }else if (response.length() == 0){
                System.out.println("Bob says: Fine. Be that way!");
            }else if (response.toLowerCase().startsWith("stop") || response.toLowerCase().startsWith("end") || response.toLowerCase().startsWith("walk away") || response.toLowerCase().startsWith("no")){
                System.out.println("Bob says: Whatever.");
                continueTalk = false;
            }else {
                System.out.println("Bob says: What?");
            }
        }while (continueTalk);
    }
}
