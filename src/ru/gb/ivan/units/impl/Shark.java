package ru.gb.ivan.units.impl;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.WaterUnit;

public class Shark extends AbstractUnit implements WaterUnit {
    public Shark(Color color, String name) {
        super(color, name);
    }

    @Override
    public void swim(int length, int deep){
        System.out.println(this.getColor() + " shark \"" + this.getName() +" swims for " + length + " meters on the " + deep + " depths");
    }
}
