import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // TODO: Uncomment the code below to pass the first stage
            System.out.print("$ ");
            System.out.flush();

            String command = scanner.nextLine();

            System.out.println(command + ": command not found");
        }
    }
}