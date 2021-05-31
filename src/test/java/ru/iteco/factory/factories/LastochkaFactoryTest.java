package ru.iteco.factory.factories;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.iteco.factory.api.Body;
import ru.iteco.factory.api.CarFactory;
import ru.iteco.factory.api.Engine;
import ru.iteco.factory.api.Interior;
import ru.iteco.factory.bmw.BmwBody;
import ru.iteco.factory.enums.CarType;
import ru.iteco.factory.enums.FuelType;
import ru.iteco.factory.mercedes.MercedesEngine;
import ru.iteco.factory.tesla.TeslaInterior;

import static org.junit.jupiter.api.Assertions.*;

class LastochkaFactoryTest {

    private static CarFactory lastochkaFactory;

    @BeforeAll
    static void beforeAll() {
        lastochkaFactory = new LastochkaFactory();
    }

    @Test
    void createBody() {
        final Body body = lastochkaFactory.createBody();
        assertNotNull(body);
        assertEquals("lastochka", body.getName());
        assertEquals("true", body.getColor());
        assertEquals(CarType.HATCHBACK, body.getType());
    }

    @Test
    void createEngine() {
        final Engine engine = lastochkaFactory.createEngine();
        assertNotNull(engine);
        assertEquals(10000L, engine.getPower());
        assertEquals(FuelType.DIESEL, engine.getFuelType());
    }

    @Test
    void createInterior() {
        final Interior interior = lastochkaFactory.createInterior();
        assertNotNull(interior);
        assertEquals("sport_posadka", interior.getName());
        assertEquals("orange", interior.getColor());
        assertEquals("silk", interior.getMaterial());
    }
}