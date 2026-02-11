package Util;

import java.io.IOException;

public class LimparTerminal {
    
    public void limpar() {

        try {
            // Detect OS to use appropriate command
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace(); // Handle failure (e.g., command not found)
        }

    }

}
