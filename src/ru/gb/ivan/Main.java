package ru.gb.ivan;

import ru.gb.ivan.common.Color;
import ru.gb.ivan.decorators.angry.Angry;
import ru.gb.ivan.manufacture.FactoryGenerator;
import ru.gb.ivan.manufacture.UnitFactory;
import ru.gb.ivan.units.LandUnit;
import ru.gb.ivan.units.WaterUnit;

public class Main {
    public static void main(String[] args) {
        UnitFactory blueFactory = FactoryGenerator.getInstance().createFactory(Color.BLUE);
        UnitFactory redFactory = FactoryGenerator.getInstance().createFactory(Color.RED);

        LandUnit blueOrc = blueFactory.createOrc("Brglyk");
        WaterUnit blueShark = blueFactory.createShark("Omnom");
        LandUnit redHuman = redFactory.createHuman("Zazubil");

        blueOrc.run(12);
        redHuman.run(10);

        LandUnit angryOrc = Angry.makeAngry(blueOrc);

        angryOrc.run(18);
        Angry.makeAngry(blueShark).swim(48, 59);
    }
}
