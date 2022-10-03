import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        ChatBot Skitty = new ChatBot("Skitty", 7);

        Skitty.greeting("Andy");
        Skitty.favoriteNumber(12);
        Skitty.weather();

        double meters = Skitty.convertFeetToMeters(20);
        System.out.println("There are " + meters + " meters in 20 feet");

        int sum = Skitty.addNumbers(300, 10, 1);
        System.out.println("The sum is "+ sum);


        Skitty.favoriteactivity("eating");

        String friends = Skitty.friends();
        System.out.println(friends);

        String message = Skitty.goodbye();
        System.out.println(message);
    }
}
