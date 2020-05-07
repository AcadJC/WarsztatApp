import java.io.IOException;
import java.util.Scanner;

public class Main {

    /**
     * Console clean
     *
     * @note this function work only on Windows systems.
     */
    public static void clear_cls() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println("\n   [Exception]:");
            System.out.println(ex.getMessage());
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("\nhehehe");
        Scanner linein = new Scanner(System.in);
        System.out.println("\n\npress any key to clear console.");
        linein.nextLine();
        clear_cls();
        System.out.println("Awesome this console is preaty clear.");
        System.out.println("");
        System.out.println("hit a button to exit app.");
        linein.nextLine();
    }
}
