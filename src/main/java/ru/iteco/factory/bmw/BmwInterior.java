package ru.iteco.factory.bmw;

import ru.iteco.factory.api.AbstractInterior;

public class BmwInterior extends AbstractInterior {

    public BmwInterior(String name, String color, String material) {
        super(name, color, material);
    }

    public BmwInterior() {
        this("elite", "white", "leather");
    }
}
