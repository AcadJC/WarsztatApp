import java.util.Scanner;

import static com.util.feature.Windows.clrcls;

public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.println("\nhehehe");
        Scanner linein = new Scanner(System.in);
        System.out.println("\n\npress any key to clear console.");
        linein.nextLine();
        clrcls();
        System.out.println("Awesome this console is preaty clear.");
        System.out.println("");
        System.out.println("hit a button to exit app.");
        linein.nextLine();
    }
}
