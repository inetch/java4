package ru.gb.ivan.decorators;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.LandUnit;
import ru.gb.ivan.units.WaterUnit;

public abstract class WaterUnitDecorator extends UnitDecorator implements WaterUnit {
    private final WaterUnit unit;

    public WaterUnitDecorator(WaterUnit unit){
        super(unit);
        this.unit = unit;
    }

    @Override
    public void swim(int length, int deep){
        unit.swim(length, deep);
    }

}