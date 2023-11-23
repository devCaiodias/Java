package excecao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class TesteThows {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("excecao/nota.txt");

        PrintWriter print = new PrintWriter(fw);
        print.println("Maca = 4.0");
        print.println("morango = 7.0");
        print.println("total = 11.0");

        print.println("Caio gostoso ");
        print.close();
        fw.close();
        
    }
}
