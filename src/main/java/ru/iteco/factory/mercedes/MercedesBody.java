package ru.iteco.factory.mercedes;

import ru.iteco.factory.api.AbstractBody;
import ru.iteco.factory.enums.CarType;

public class MercedesBody extends AbstractBody {

    public MercedesBody(String name, String color, CarType type) {
        super(name, color, type);
    }

    public MercedesBody() {
        this("elegant", "black", CarType.SEDAN);
    }
}
