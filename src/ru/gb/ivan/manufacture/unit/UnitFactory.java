package ru.gb.ivan.manufacture.unit;

import ru.gb.ivan.units.impl.Human;
import ru.gb.ivan.units.impl.Orc;
import ru.gb.ivan.units.impl.Shark;

public interface UnitFactory {
    Human createHuman(String name);
    Orc createOrc(String name);
    Shark createShark(String name);
}
