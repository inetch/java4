package ru.gb.ivan.command;

import ru.gb.ivan.manufacture.FactoryGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class CommandInvoker {
    private static volatile CommandInvoker instance;
    private final List<Command> commandList = new ArrayList<>();
    private final ConcurrentMap<String, List<Command>> commandMap = new ConcurrentHashMap<>();

    private CommandInvoker(){}
    public static CommandInvoker getInstance(){
        CommandInvoker invoker = instance;

        if (invoker == null){
            synchronized (CommandInvoker.class){
                invoker = instance;
                if(invoker == null){
                    instance = invoker = new CommandInvoker();
                }
            }
        }

        return invoker;
    }

    public void addCommand(Command command){
        commandMap.computeIfAbsent(command.getName(), k -> new ArrayList<>()).add(command);
    }

    public void executeAllByName(String commandName){
        List<Command> list = commandMap.get(commandName);
        for(Command command : list){
            command.execute();
        }
    }

    public void saveAndExecute(Command command){
        commandList.add(command);
        command.execute();
    }

}
