package ru.gb.ivan.units.impl;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.LandUnit;

public class Human extends AbstractUnit implements LandUnit {
    public Human(Color color, String name) {
        super(color, name);
    }

    @Override
    public void run(int step){
        System.out.println(this.getColor() + " human \"" + this.getName() + "\" runs " + step + " steps");
    }
}
