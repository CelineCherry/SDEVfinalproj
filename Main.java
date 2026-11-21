import java.util.Scanner;

public class Main {
    String user = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("starting"); 

        String inp = "";

        // Add new 
        while (!inp.equals("exit")) {
            System.out.println("Welcome to the Employee Managment System. Enter keywords to do commands.");
            
            System.out.println("\tlogin - Login as an employee or HR head.");
            System.out.println("\texit - Exit program.");

            inp = scanner.nextLine().toLowerCase();

            switch (inp) {
                case "login":
                    authenticate();
                    break;
                
                case "exit":
                    break;
                    
                default:
                    System.out.println("Keyword not recognized. Please retype.");
                    break;
            }
        }   
        System.out.println("exited loop");
    }

    static void authenticate(){
        // user types either MANAGER or [employee name] and enters password "password"
        System.out.println("authentication would go here");
    }
}
