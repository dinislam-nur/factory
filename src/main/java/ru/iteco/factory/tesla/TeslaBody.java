package ru.iteco.factory.tesla;

import ru.iteco.factory.api.AbstractBody;
import ru.iteco.factory.enums.CarType;

public class TeslaBody extends AbstractBody {

    public TeslaBody(String name, String color, CarType type) {
        super(name, color, type);
    }

    public TeslaBody() {
        this("power", "blue", CarType.SEDAN);
    }
}
