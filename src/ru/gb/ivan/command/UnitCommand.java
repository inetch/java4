package ru.gb.ivan.command;

import ru.gb.ivan.units.Unit;

public class UnitCommand implements Command {
    private Unit unit;
    private CommandType commandType;

    public enum CommandType{
        EAT
      , WORK
      , FIGHT
    }

    public UnitCommand(Unit unit, CommandType commandType){
        this.unit = unit;
        this.commandType = commandType;
    }

    @Override
    public void execute(){
        unit.executeCommand(this);
    }

    @Override
    public String getName(){
        return commandType.name();
    }
}
