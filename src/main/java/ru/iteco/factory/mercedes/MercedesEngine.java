package ru.iteco.factory.mercedes;

import ru.iteco.factory.api.AbstractEngine;
import ru.iteco.factory.enums.FuelType;

public class MercedesEngine extends AbstractEngine {

    public MercedesEngine(Long power, FuelType type) {
        super(power, type);
    }

    public MercedesEngine() {
        this(1500L, FuelType.PETROL);
    }
}
