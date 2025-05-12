import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("uid:");
        String input = scanner.nextLine();

        String regex = "^[a-zA-Z0-9-_.@]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

    }
}
