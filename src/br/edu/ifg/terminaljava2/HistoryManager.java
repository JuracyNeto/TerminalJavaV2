package br.edu.ifg.terminaljava2;

import java.io.*;
import java.util.*;

public class HistoryManager {
    private static final String HISTORY_FILE = "history.txt";

    public static void saveCommand(String command) {
        try (FileWriter writer = new FileWriter(HISTORY_FILE, true)) {
            writer.write(command + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar comando no histórico: " + e.getMessage());
        }
    }

    public static List<String> getHistory() {
        List<String> history = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler histórico: " + e.getMessage());
        }
        return history;
    }
}
