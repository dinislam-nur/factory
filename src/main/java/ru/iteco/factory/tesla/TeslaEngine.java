package ru.iteco.factory.tesla;

import ru.iteco.factory.api.AbstractEngine;
import ru.iteco.factory.enums.FuelType;

public class TeslaEngine extends AbstractEngine {

    public TeslaEngine(Long power, FuelType type) {
        super(power, type);
    }

    public TeslaEngine() {
        this(920L, FuelType.ELECTRICITY);
    }
}
