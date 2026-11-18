
@SuppressWarnings("deprecation")
public class LegacyMain {

    public static void main(String[] args) {

        LegacyWeatherData weatherData = new LegacyWeatherData();

        LegacyDisplay display = new LegacyDisplay();

        weatherData.addObserver(display);

        System.out.println("First weather update:");
        weatherData.setMeasurements(25.5f, 65.0f, 1012.0f);

        System.out.println("\nSecond weather update:");
        weatherData.setMeasurements(27.0f, 70.0f, 1015.0f);

        System.out.println("\nThird weather update:");
        weatherData.setMeasurements(22.0f, 90.0f, 1008.0f);

        weatherData.deleteObserver(display);

        System.out.println("\nObserver removed.");
        weatherData.setMeasurements(24.0f, 75.0f, 1010.0f);
    }
}

