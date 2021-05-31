package ru.iteco.factory.factories;

import ru.iteco.factory.api.Body;
import ru.iteco.factory.api.CarFactory;
import ru.iteco.factory.api.Engine;
import ru.iteco.factory.api.Interior;
import ru.iteco.factory.tesla.TeslaBody;
import ru.iteco.factory.tesla.TeslaEngine;
import ru.iteco.factory.tesla.TeslaInterior;

public class TeslaFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new TeslaBody();
    }

    @Override
    public Engine createEngine() {
        return new TeslaEngine();
    }

    @Override
    public Interior createInterior() {
        return new TeslaInterior();
    }
}
