package ru.gb.ivan.manufacture;

import ru.gb.ivan.common.Color;

public class FactoryGenerator {
    private static volatile FactoryGenerator instance;

    public UnitFactory createFactory(Color color){
        UnitFactory factory;

        switch(color){
            case RED:
                factory = new RedFactory();
                break;
            case BLUE:
                factory = new BlueFactory();
                break;
            default:
                factory = null;
        }

        return factory;
    }

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
