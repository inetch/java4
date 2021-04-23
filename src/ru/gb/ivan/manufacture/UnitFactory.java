package ru.gb.ivan.manufacture;

import ru.gb.ivan.units.Unit;
import ru.gb.ivan.units.impl.Human;
import ru.gb.ivan.units.impl.Orc;
import ru.gb.ivan.units.impl.Shark;

import java.util.List;

public interface UnitFactory {
    Human createHuman(String name);
    Orc createOrc(String name);
    Shark createShark(String name);
    List<Unit> getUnits();
}
