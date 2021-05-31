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

class BmwFactoryTest {

    private static CarFactory bmwFactory;

    @BeforeAll
    static void beforeAll() {
        bmwFactory = new BmwFactory();
    }

    @Test
    void createBody() {
        final Body bmwBody = bmwFactory.createBody();
        assertNotNull(bmwBody);
        assertEquals("casual_bmw_body",bmwBody.getName());
        assertEquals("red", bmwBody.getColor());
        assertEquals(CarType.SEDAN, bmwBody.getType());
    }

    @Test
    void createEngine() {
        final Engine engine = bmwFactory.createEngine();
        assertNotNull(engine);
        assertEquals(1000L, engine.getPower());
        assertEquals(FuelType.PETROL, engine.getFuelType());
    }

    @Test
    void createInterior() {
        final Interior interior = bmwFactory.createInterior();
        assertNotNull(interior);
        assertEquals("elite",interior.getName());
        assertEquals("white", interior.getColor());
        assertEquals("leather", interior.getMaterial());
    }
}