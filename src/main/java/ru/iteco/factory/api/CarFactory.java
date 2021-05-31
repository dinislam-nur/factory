package ru.iteco.factory.api;

public interface CarFactory {

    Body createBody();

    Engine createEngine();

    Interior createInterior();
}
