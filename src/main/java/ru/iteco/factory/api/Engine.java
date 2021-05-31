package ru.iteco.factory.api;

import ru.iteco.factory.enums.FuelType;

public interface Engine {

    Long getPower();

    FuelType getFuelType();

}
