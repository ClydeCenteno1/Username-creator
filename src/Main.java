import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        //Username must be between 4-12 characters
        //Username must not contain spaces or underscores
    Scanner scanner = new Scanner(System.in);

    String username;

    System.out.println("Enter your username: ");
    username = scanner.nextLine();

    if(username.length() < 4 || username.length() > 12){
        System.out.println("Your username must be between 4-12 characters");
    }

    else if(username.contains(" ") || username.contains("_")){
          System.out.println("Username must not contain spaces or underscores");
        }

    else{
        System.out.print("Hello, "+username);
        }

    scanner.close();
    }
}
