package ru.iteco.factory.api;

import ru.iteco.factory.enums.FuelType;

public abstract class AbstractEngine implements Engine {

    private final Long power;
    private final FuelType type;

    protected AbstractEngine(Long power, FuelType type) {
        this.power = power;
        this.type = type;
    }

    @Override
    public Long getPower() {
        return power;
    }

    @Override
    public FuelType getFuelType() {
        return type;
    }
}
