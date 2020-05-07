package com.util.feature;

import java.io.IOException;

public class Windows {

    /**
     * Clean console window.
     *  -this function work only on windows os.
     *
     *
     * @return void
     * @throws InterruptedException
     */
    public static void clrcls() {
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
}
