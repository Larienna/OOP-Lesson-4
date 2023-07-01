package Task5;

public class ConverterTemperature implements TemperatureConverter {
    // The implements keyword is used to implement interfaces and inherit their methods.
    @Override
    public double convertToKelvin(double temperature) {
        return temperature + 273.15;
    }

    @Override
    public double convertToFahrenheit(double temperature) {
        return temperature * 1.8 + 32;
    }
}
