package br.edu.ifg.terminaljava2;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
    private final Map<String,  Command> commands = new HashMap<>();

    public CommandHandler(){
        FileManager fileManager = new FileManager();
        DirectoryManager dirManager = new DirectoryManager();

        commands.put("pwd", new PwdCommand());
        commands.put("ls", new LsCommand());
        commands.put("touch", new TouchCommand(fileManager));
        commands.put("cd", new CdCommand(dirManager));
        commands.put("mkdir", new MkdirCommand(dirManager));
        commands.put("rm", new RmCommand());
        commands.put("cat",  new CatCommand());
        commands.put("echo", new EchoCommand());
        commands.put("history", new HistoryCommand());
    }

    public void executeCommand(String ent){
        String[] in = ent.split(" ");
        String comando = in[0];

        Command cmd = commands.get(comando);

        if(cmd != null){
            cmd.execute(in);
            HistoryManager.saveCommand(ent);
        }else{
            System.out.println("'" + in[0] + "' não é reconhecido como um comando interno\r\n" + //
                                "ou externo, um programa operável ou um arquivo em lotes.");
        }
    }
}

