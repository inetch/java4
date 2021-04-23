package ru.gb.ivan.manufacture;

import ru.gb.ivan.common.Color;

public class FactoryGenerator {
    private static volatile FactoryGenerator instance;

    public UnitFactory createUnitFactory(Color color){
        UnitFactory factory;

        switch(color){
            case RED:
                factory = new RedUnitFactory();
                break;
            case BLUE:
                factory = new BlueUnitFactory();
                break;
            default:
                factory = null;
        }

        return factory;
    }

    public UnitCommandFactory createUnitCommandFactory(){
        UnitCommandFactory factory = new UnitCommandFactoryImpl();
        return factory;
    }

    private FactoryGenerator(){}

    public static FactoryGenerator getInstance() {
        FactoryGenerator gen = instance;

        if (gen == null) {
            synchronized (FactoryGenerator.class) {
                gen = instance;
                if (gen == null) {
                    instance = gen = new FactoryGenerator();
                }
            }
        }

        return gen;
    }
}
