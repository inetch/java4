package ru.gb.ivan.manufacture;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.units.Unit;
import ru.gb.ivan.units.impl.Human;
import ru.gb.ivan.units.impl.Orc;
import ru.gb.ivan.units.impl.Shark;

import java.util.ArrayList;
import java.util.List;

public class RedUnitFactory implements UnitFactory {
    private final Color color = Color.RED;
    private final List<Unit> unitList = new ArrayList<>();

    RedUnitFactory(){}

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
