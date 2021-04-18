package ru.gb.ivan.units.impl;

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

    public String getName(){
        return this.name;
    }
}
