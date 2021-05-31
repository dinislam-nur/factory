package ru.iteco.factory.bmw;

import ru.iteco.factory.api.AbstractBody;
import ru.iteco.factory.enums.CarType;

public class BmwBody extends AbstractBody {

    public BmwBody(String name, String color, CarType type) {
        super(name, color, type);
    }

    public BmwBody() {
        this("casual_bmw_body", "red", CarType.SEDAN);
    }

}
