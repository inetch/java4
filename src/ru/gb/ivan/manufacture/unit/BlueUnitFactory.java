package ru.gb.ivan.manufacture.unit;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.impl.Human;
import ru.gb.ivan.units.impl.Orc;
import ru.gb.ivan.units.impl.Shark;

public class BlueUnitFactory implements UnitFactory {
    private final Color color = Color.BLUE;

    BlueUnitFactory(){}

    @Override
    public Human createHuman(String name){
        return new Human(color, name);
    }

    @Override
    public Orc createOrc(String name){
        return new Orc(color, name);
    }

    @Override
    public Shark createShark(String name){
        return new Shark(color, name);
    }
}
