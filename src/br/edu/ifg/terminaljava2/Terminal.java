package br.edu.ifg.terminaljava2;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        CommandHandler commandHandler = new CommandHandler();
        String user = System.getProperty("user.name");

        while (true) {
            String dir = System.getProperty("user.dir");
            System.out.print("\033[1;32m" + user + "@root:\033[0m"); // verde
            System.out.print("\033[1;34m" + dir + "\033[0m"); // azul
            System.out.print("\033[1;36m>\033[0m "); // Ciano (azul tbm kk)
            System.out.flush();
            
            
            String ent = leia.nextLine();
            if (ent.isEmpty()) continue;
            
            System.out.println("\033[1;33m" + ent + "\033[0m"); // amarelo
            
            if (ent.equals("exit")) break;
            commandHandler.executeCommand(ent);
        }
        leia.close();
    }
}


