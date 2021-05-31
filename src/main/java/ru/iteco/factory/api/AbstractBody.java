package ru.iteco.factory.api;

import ru.iteco.factory.enums.CarType;

public abstract class AbstractBody implements Body {

    private final String name;
    private final String color;
    private final CarType type;

    protected AbstractBody(String name, String color, CarType type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public CarType getType() {
        return type;
    }
}
