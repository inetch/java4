package ru.gb.ivan;

import ru.gb.ivan.command.CommandInvoker;
import ru.gb.ivan.command.UnitCommand;
import ru.gb.ivan.common.Color;
import ru.gb.ivan.decorators.angry.Angry;
import ru.gb.ivan.manufacture.FactoryGenerator;
import ru.gb.ivan.manufacture.UnitCommandFactory;
import ru.gb.ivan.manufacture.UnitFactory;
import ru.gb.ivan.units.LandUnit;
import ru.gb.ivan.units.Unit;
import ru.gb.ivan.units.WaterUnit;

public class Main {
    public static void main(String[] args) {
        UnitFactory blueFactory = FactoryGenerator.getInstance().createUnitFactory(Color.BLUE);
        UnitFactory redFactory = FactoryGenerator.getInstance().createUnitFactory(Color.RED);

        LandUnit blueOrc = blueFactory.createOrc("Brglyk");
        WaterUnit blueShark = blueFactory.createShark("Omnom");
        LandUnit redHuman = redFactory.createHuman("Zazubil");

        blueOrc.run(12);
        redHuman.run(10);

        LandUnit angryOrc = Angry.makeAngry(blueOrc);

        angryOrc.run(18);
        Angry.makeAngry(blueShark).swim(48, 59);

        System.out.println("------ commands -----------");

        UnitCommandFactory unitCommandFactory = FactoryGenerator.getInstance().createUnitCommandFactory();

        for(Unit unit: blueFactory.getUnits()){
            CommandInvoker.getInstance().addCommand(unitCommandFactory.createCommand(unit, UnitCommand.CommandType.EAT));
            CommandInvoker.getInstance().addCommand(unitCommandFactory.createCommand(unit, UnitCommand.CommandType.WORK));
            CommandInvoker.getInstance().addCommand(unitCommandFactory.createCommand(unit, UnitCommand.CommandType.FIGHT));
        }

        for(Unit unit: redFactory.getUnits()){
            CommandInvoker.getInstance().addCommand(unitCommandFactory.createCommand(unit, UnitCommand.CommandType.EAT));
            CommandInvoker.getInstance().addCommand(unitCommandFactory.createCommand(unit, UnitCommand.CommandType.WORK));
            CommandInvoker.getInstance().addCommand(unitCommandFactory.createCommand(unit, UnitCommand.CommandType.FIGHT));
        }

        CommandInvoker.getInstance().executeAllByName("EAT");
    }
}
