package ru.iteco.factory.mercedes;

import ru.iteco.factory.api.AbstractInterior;

public class MercedesInterior extends AbstractInterior {

    public MercedesInterior(String name, String color, String material) {
        super(name, color, material);
    }

    public MercedesInterior() {
        this("premium", "black", "only_leather");
    }
}
