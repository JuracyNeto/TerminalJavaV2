package br.edu.ifg.terminaljava2;

public class CdCommand implements Command {
    private final DirectoryManager dirManager;

    public CdCommand(DirectoryManager dirManager) {
        this.dirManager = dirManager;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso correto: cd <caminho>");
            return;
        }
        dirManager.changeDirectory(args[1]);
    }
}

