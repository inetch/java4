package ru.gb.ivan.manufacture;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.Unit;
import ru.gb.ivan.units.impl.Human;
import ru.gb.ivan.units.impl.Orc;
import ru.gb.ivan.units.impl.Shark;

import java.util.ArrayList;
import java.util.List;

public class BlueUnitFactory implements UnitFactory {
    private final Color color = Color.BLUE;
    private final List<Unit> unitList = new ArrayList<>();

    BlueUnitFactory(){}

    @Override
    public Human createHuman(String name){
        Human unit = new Human(color, name);
        unitList.add(unit);
        return unit;
    }

    @Override
    public Orc createOrc(String name){
        Orc unit = new Orc(color, name);
        unitList.add(unit);
        return unit;
    }

    @Override
    public Shark createShark(String name){
        Shark unit = new Shark(color, name);
        unitList.add(unit);
        return unit;
    }

    @Override
    public List<Unit> getUnits(){
        return unitList;
    }
}
