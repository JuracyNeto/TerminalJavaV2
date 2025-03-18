package br.edu.ifg.terminaljava2;

public class PwdCommand implements Command{
    @Override
    public void execute(String[] args){
        String path = (System.getProperty("user.dir"));
        System.out.println("\nPath\n----\n" + path + "\n");
    }
}
