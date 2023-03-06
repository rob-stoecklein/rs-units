package com.github.robstoecklein.units;

public abstract class TemperatureUnits extends Unit {

    public TemperatureUnits(String name, String plural, String abbr, double scale, double offset, boolean isStandard) {
        super(name, plural, abbr, scale, offset, isStandard);
    }

    public static class Celsius extends TemperatureUnits {
        public Celsius() {
            super("Celsius", "", "C", 1.0, 0.0, true);
        }
    }

    public static class Fahrenheit extends TemperatureUnits {
        public Fahrenheit() {
            super("Fahrenheit", "", "F", 1.8, 32.0, false);
        }
    }

    public static class Kelvin extends TemperatureUnits {
        public Kelvin() {
            super("Kelvin", "", "k", 0.0, 0.0, false);
        }
    }
}