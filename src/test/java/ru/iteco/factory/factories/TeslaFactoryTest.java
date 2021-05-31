package ru.iteco.factory.factories;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.iteco.factory.api.Body;
import ru.iteco.factory.api.CarFactory;
import ru.iteco.factory.api.Engine;
import ru.iteco.factory.api.Interior;
import ru.iteco.factory.enums.CarType;
import ru.iteco.factory.enums.FuelType;

import static org.junit.jupiter.api.Assertions.*;

class TeslaFactoryTest {

    private static CarFactory teslaFactory;

    @BeforeAll
    static void beforeAll() {
        teslaFactory = new TeslaFactory();
    }

    @Test
    void createBody() {
        final Body body = teslaFactory.createBody();
        assertNotNull(body);
        assertEquals("power", body.getName());
        assertEquals("blue", body.getColor());
        assertEquals(CarType.SEDAN, body.getType());
    }

    @Test
    void createEngine() {
        final Engine engine = teslaFactory.createEngine();
        assertNotNull(engine);
        assertEquals(920L, engine.getPower());
        assertEquals(FuelType.ELECTRICITY, engine.getFuelType());
    }

    @Test
    void createInterior() {
        final Interior interior = teslaFactory.createInterior();
        assertNotNull(interior);
        assertEquals("comfort", interior.getName());
        assertEquals("grey", interior.getColor());
        assertEquals("alcantara", interior.getMaterial());
    }
}