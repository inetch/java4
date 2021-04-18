package ru.gb.ivan.decorators.angry;

import ru.gb.ivan.decorators.LandUnitDecorator;
import ru.gb.ivan.units.LandUnit;
import ru.gb.ivan.units.Unit;

public class LandAngryUnit extends LandUnitDecorator implements LandUnit {
    public LandAngryUnit(LandUnit unit) {
        super(unit);
        System.out.println(unit.getClass().getName() + " roars");
    }

    @Override
    public void run(int step){
        super.run(step);
        System.out.println("... and HITS SOMEONE WITH BIG CLUB");
    }
}
