package ru.gb.ivan.units.impl;

import ru.gb.ivan.command.UnitCommand;
import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.Unit;

public abstract class AbstractUnit implements Unit {
    private final Color color;
    private final String name;

    public AbstractUnit (Color color, String name){
        this.color = color;
        this.name = name;
    }

    @Override
    public Color getColor(){
        return this.color;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void executeCommand(UnitCommand command){
        System.out.println(this.color + " " + this.name + " do " + command.getName());
    }
}
