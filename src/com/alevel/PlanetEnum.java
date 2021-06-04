package com.alevel;

public enum PlanetEnum {
    //Создать PlanetEnum с методом возвращающим количество естественных спутников планеты.

    MERCURY(0),
    VENUS(0),
    EARTH(1),
    MARS(2),
    NEPTUNE(14),
    URANUS(27),
    SATURN(62),
    JUPITER(79);

    int satelliteCount;

    private PlanetEnum(int count) {
        satelliteCount = count;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }

}
