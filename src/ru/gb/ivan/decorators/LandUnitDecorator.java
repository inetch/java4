package ru.gb.ivan.decorators;

import ru.gb.ivan.command.UnitCommand;
import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.LandUnit;
import ru.gb.ivan.units.Unit;

public abstract class LandUnitDecorator extends UnitDecorator implements LandUnit {
    private final LandUnit unit;

    public LandUnitDecorator(LandUnit unit){
        super(unit);
        this.unit = unit;
    }

    @Override
    public void run(int step){
        unit.run(step);
    }
}
