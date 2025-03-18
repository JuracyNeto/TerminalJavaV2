package br.edu.ifg.terminaljava2;

import java.util.List;

public class HistoryCommand implements Command {
    @Override
    public void execute(String[] args) {
        List<String> history = HistoryManager.getHistory();

        if (history.isEmpty()) {
            System.out.println("Nenhum comando no histórico.");
            return;
        }

        
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + " " + history.get(i));
        }
    }
}
