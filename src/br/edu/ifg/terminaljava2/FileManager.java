package br.edu.ifg.terminaljava2;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public boolean createFile(String nome) {
        try {
            File arquivo = new File(System.getProperty("user.dir") + "/" + nome);
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getAbsolutePath());
                return true;
            } else {
                System.out.println("O arquivo já existe.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            return false;
        }
    }
}


