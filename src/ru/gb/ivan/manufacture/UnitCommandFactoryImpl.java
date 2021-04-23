package ru.gb.ivan.manufacture;

import ru.gb.ivan.command.Command;
import ru.gb.ivan.command.UnitCommand;
import ru.gb.ivan.units.Unit;

public class UnitCommandFactoryImpl implements UnitCommandFactory{
    @Override
    public Command createCommand(Unit unit, UnitCommand.CommandType commandType){
        Command command = new UnitCommand(unit, commandType);
        return command;
    }
}
