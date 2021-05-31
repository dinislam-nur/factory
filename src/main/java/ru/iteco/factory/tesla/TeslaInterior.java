package ru.iteco.factory.tesla;

import ru.iteco.factory.api.AbstractInterior;

public class TeslaInterior extends AbstractInterior {

    public TeslaInterior(String name, String color, String material) {
        super(name, color, material);
    }

    public TeslaInterior() {
        this("comfort", "grey", "alcantara");
    }
}
