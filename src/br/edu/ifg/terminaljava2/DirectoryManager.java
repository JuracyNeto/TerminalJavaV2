/**
 * 
 */
package br.edu.ifg.terminaljava2;

import java.io.File;

public class DirectoryManager {
    private String previousDirectory = System.getProperty("user.dir");

    public boolean createDirectory(String nome) {
        File dir = new File(System.getProperty("user.dir") + "/" + nome);
        if (dir.mkdir()) {
            System.out.println("Diretorio criado: " + dir.getAbsolutePath());
            return true;
        } else {
            System.out.println("O diretorio já existe ou erro ao criar.");
            return false;
        }
    }

    public boolean changeDirectory(String caminho) {
        if (caminho.equals("..")) {
            File parentDir = new File(System.getProperty("user.dir")).getParentFile();
            if (parentDir != null) {
                previousDirectory = System.getProperty("user.dir");
                System.setProperty("user.dir", parentDir.getAbsolutePath());
                return true;
            }
        } else if (caminho.equals("-")) {
            String temp = System.getProperty("user.dir");
            System.setProperty("user.dir", previousDirectory);
            previousDirectory = temp;
            return true;
        } else {
            File entraDir = new File(caminho);
            if (entraDir.exists() && entraDir.isDirectory()) {
                previousDirectory = System.getProperty("user.dir");
                System.setProperty("user.dir", entraDir.getAbsolutePath());
                return true;
            }
        }
        System.out.println("Diretório inválido: " + caminho);
        return false;
    }
}




