package br.edu.ifg.terminaljava2;

import java.io.*;

public class EchoCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: echo \"<texto>\" <arquivo>");
            return;
        }

      
        StringBuilder texto = new StringBuilder();
        for (int i = 1; i < args.length - 1; i++) { 
            texto.append(args[i]).append(" ");
        }

        File escreve = new File(args[args.length - 1]);

        try (FileWriter escritor = new FileWriter(escreve, true)) { 
            escritor.write(texto.toString().trim() + "\n"); 
            System.out.println("Texto adicionado ao arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

