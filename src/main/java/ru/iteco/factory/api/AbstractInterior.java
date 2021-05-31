package ru.iteco.factory.api;

public abstract class AbstractInterior implements Interior {

    private final String name;
    private final String color;
    private final String material;

    protected AbstractInterior(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.material = material;
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
    public String getMaterial() {
        return material;
    }
}
