package ru.gb.ivan.units;

import ru.gb.ivan.command.UnitCommand;
import ru.gb.ivan.common.Color;

public interface Unit {
    Color getColor();
    String getName();
    void executeCommand(UnitCommand command);
}
