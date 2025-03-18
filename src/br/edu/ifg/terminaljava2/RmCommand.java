package br.edu.ifg.terminaljava2;

import java.io.File;

public class RmCommand implements Command {
    @Override
    public void execute(String []args){
        if (args.length < 2) {
            System.out.println("Uso correto: rm <arquivo/diretorio>");
            return;
        }

        File rm = new File(args[1]);
        if(rm.exists() && rm.isDirectory()){
            System.out.println("Diretório '" + rm + "' excluido");
            rm.delete();
        }else if(rm.isFile()){
            System.out.println("Arquivo '" + rm + "' excluido");
            rm.delete(); 
        }else{
            System.out.println("<Arquivo/Diretório> inválido: " + rm);
        }
    }
}

