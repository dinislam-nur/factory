package ru.iteco.factory.bmw;

import ru.iteco.factory.api.AbstractEngine;
import ru.iteco.factory.enums.FuelType;

public class BmwEngine extends AbstractEngine {

    public BmwEngine(Long power, FuelType type) {
        super(power, type);
    }

    public BmwEngine() {
        this(1000L, FuelType.PETROL);
    }
}
