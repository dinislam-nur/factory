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

class MercedesFactoryTest {

    private static CarFactory mercedesFactory;

    @BeforeAll
    static void beforeAll() {
        mercedesFactory = new MercedesFactory();
    }

    @Test
    void createBody() {
        final Body body = mercedesFactory.createBody();
        assertNotNull(body);
        assertEquals("elegant", body.getName());
        assertEquals("black", body.getColor());
        assertEquals(CarType.SEDAN, body.getType());
    }

    @Test
    void createEngine() {
        final Engine engine = mercedesFactory.createEngine();
        assertNotNull(engine);
        assertEquals(1500L, engine.getPower());
        assertEquals(FuelType.PETROL, engine.getFuelType());
    }

    @Test
    void createInterior() {
        final Interior interior = mercedesFactory.createInterior();
        assertNotNull(interior);
        assertEquals("premium", interior.getName());
        assertEquals("black", interior.getColor());
        assertEquals("only_leather", interior.getMaterial());
    }
}