package ru.iteco.factory.factories;

import ru.iteco.factory.api.*;
import ru.iteco.factory.bmw.BmwBody;
import ru.iteco.factory.enums.CarType;
import ru.iteco.factory.enums.FuelType;
import ru.iteco.factory.mercedes.MercedesEngine;
import ru.iteco.factory.tesla.TeslaInterior;

public class LastochkaFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new BmwBody("lastochka", "true", CarType.HATCHBACK);
    }

    @Override
    public Engine createEngine() {
        return new MercedesEngine(10000L, FuelType.DIESEL);
    }

    @Override
    public Interior createInterior() {
        return new TeslaInterior("sport_posadka", "orange", "silk");
    }
}
