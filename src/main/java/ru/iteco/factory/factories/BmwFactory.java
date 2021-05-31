package ru.iteco.factory.factories;

import ru.iteco.factory.api.Body;
import ru.iteco.factory.api.CarFactory;
import ru.iteco.factory.api.Engine;
import ru.iteco.factory.api.Interior;
import ru.iteco.factory.bmw.BmwBody;
import ru.iteco.factory.bmw.BmwEngine;
import ru.iteco.factory.bmw.BmwInterior;

public class BmwFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new BmwBody();
    }

    @Override
    public Engine createEngine() {
        return new BmwEngine();
    }

    @Override
    public Interior createInterior() {
        return new BmwInterior();
    }
}
