package ru.iteco.factory.factories;

import ru.iteco.factory.api.Body;
import ru.iteco.factory.api.CarFactory;
import ru.iteco.factory.api.Engine;
import ru.iteco.factory.api.Interior;
import ru.iteco.factory.mercedes.MercedesBody;
import ru.iteco.factory.mercedes.MercedesEngine;
import ru.iteco.factory.mercedes.MercedesInterior;

public class MercedesFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new MercedesBody();
    }

    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    public Interior createInterior() {
        return new MercedesInterior();
    }
}
