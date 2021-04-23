package ru.gb.ivan.manufacture;

import ru.gb.ivan.command.Command;
import ru.gb.ivan.command.UnitCommand;
import ru.gb.ivan.units.Unit;

public interface UnitCommandFactory {
    Command createCommand(Unit unit, UnitCommand.CommandType commandType);
}
