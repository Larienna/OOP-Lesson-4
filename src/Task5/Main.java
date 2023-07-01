package Task5;
/**
 * Write a ConverterTemperature class to convert from degrees Celsius to Kelvin, Fahrenheit.
 * The class must have a convert method that does the conversion.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new ConverterTemperature();
        Scanner in = new Scanner(System.in);
        System.out.println("What temperature you have in °C ? Enter: ");
        double temperatureCelsius = in.nextDouble();

        double temperatureKelvin = converter.convertToKelvin(temperatureCelsius);
        double temperatureFahrenheit = converter.convertToFahrenheit(temperatureCelsius);

        System.out.println("Temperature " + temperatureCelsius + " °C = " + temperatureKelvin + " K");
        System.out.println("Temperature " + temperatureCelsius + " °C = " + temperatureFahrenheit + " °F");
    }
}
