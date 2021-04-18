package ru.gb.ivan.decorators.angry;


import ru.gb.ivan.decorators.WaterUnitDecorator;
import ru.gb.ivan.units.WaterUnit;

public class WaterAngryUnit extends WaterUnitDecorator implements WaterUnit {
    public WaterAngryUnit(WaterUnit unit) {
        super(unit);
        System.out.println(unit.getClass().getName() + " gulps");
    }

    @Override
    public void swim(int length, int deep){
        super.swim(length, deep);
        System.out.println("... and BITES SOMEONE WITH TEETH!");
    }
}