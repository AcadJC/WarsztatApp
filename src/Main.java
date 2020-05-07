import java.util.Scanner;

import com.workshop.Application;

public class Main {
    private static Scanner icstream = new Scanner(System.in);
    private static final Application app = new Application();

    public static void main(String[] args) {
        app.HeaderPrint();
        app.SelectServicePrint();
    }
}
