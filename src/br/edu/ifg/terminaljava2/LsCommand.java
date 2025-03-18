package br.edu.ifg.terminaljava2;

import java.io.File;

public class LsCommand implements Command{
    @Override
    public void execute(String[] args){
        File dir = new File(System.getProperty("user.dir"));
        for(String file : dir.list()){
            System.out.println(file);
        }
    }

} 

