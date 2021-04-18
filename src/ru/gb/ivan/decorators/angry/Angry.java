package ru.gb.ivan.decorators.angry;

import ru.gb.ivan.units.LandUnit;
import ru.gb.ivan.units.WaterUnit;

import java.util.Arrays;

public class Angry {
    public static LandUnit makeAngry(LandUnit unit){
        return new LandAngryUnit(unit);
    }

    public static WaterUnit makeAngry(WaterUnit unit){
        return new WaterAngryUnit(unit);
    }
}
