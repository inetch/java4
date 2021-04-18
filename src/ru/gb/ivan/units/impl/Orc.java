package ru.gb.ivan.units.impl;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.LandUnit;

public class Orc extends AbstractUnit implements LandUnit {
    public Orc(Color color, String name) {
        super(color, name);
    }

    @Override
    public void run(int step){
        System.out.println(this.getColor() + " orc \"" + this.getName() + "\" runs " + step + " steps");
    }
}
