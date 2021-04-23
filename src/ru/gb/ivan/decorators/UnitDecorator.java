package ru.gb.ivan.decorators;

import ru.gb.ivan.command.UnitCommand;
import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.Unit;

public abstract class UnitDecorator implements Unit {
    private final Unit unit;

    public UnitDecorator(Unit unit){
        this.unit = unit;
    }

    @Override
    public String getName(){
        return unit.getName();
    }

    @Override
    public Color getColor(){
        return unit.getColor();
    }

    @Override
    public void executeCommand(UnitCommand command){
        unit.executeCommand(command);
    }
}
