import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========OS v1.0=========");
        System.out.println("Type 'help' for commands");

        while(true) {
            System.out.println("\nuser@javaOS:~$");
            String command = scanner.nextLine();

            if (command.equals("help")){

                System.out.println("help     -show comamnds");
                System.out.println("ls       -List files");
                System.out.println("clear    -Clear screen");
                System.out.println("exit     -Exit");


            }else if (command.equals("ls")){

                System.out.println("Documents");
                System.out.println("Games");
                System.out.println("notes.txt");
            }else if (command.equals("clear")){

                for(int i = 0; i < 30; i++) {
                    System.out.println();
                }
            }else if (command.equals("exit")){
                System.out.println("Exitting...");
                break;
            }else System.out.println("Command not valid");
        }
        scanner.close();
    }
}