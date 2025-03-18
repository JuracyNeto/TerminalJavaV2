package br.edu.ifg.terminaljava2;

import java.io.*;

public class CatCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: cat <arquivo>");
            return;
        }

        File ler = new File(args[1]);

        if (!ler.exists() || !ler.isFile()) {
            System.out.println("Arquivo não encontrado.");
            return;
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(ler))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}


