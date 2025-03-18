package br.edu.ifg.terminaljava2;

public class TouchCommand implements Command {
    private final FileManager fileManager;

    public TouchCommand(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso correto: touch <nome_do_arquivo>");
            return;
        }
        fileManager.createFile(args[1]);
    }
}


