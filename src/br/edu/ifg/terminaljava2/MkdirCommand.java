package br.edu.ifg.terminaljava2;

public class MkdirCommand implements Command{
    private final DirectoryManager dirManager;

    public MkdirCommand(DirectoryManager dirManager){
        this.dirManager = dirManager;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso correto: mkdir <nome_do_diretorio>");
            return;
        }
        dirManager.createDirectory(args[1]);
    }
    
}

