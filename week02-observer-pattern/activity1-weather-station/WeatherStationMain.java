
public class WeatherStationMain {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay();

        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay();

        ForecastDisplay forecastDisplay =
                new ForecastDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);

        System.out.println("First weather update:");
        weatherData.setMeasurements(25.5f, 65.0f, 1012.0f);

        System.out.println("\nSecond weather update:");
        weatherData.setMeasurements(27.0f, 70.0f, 1015.0f);

        System.out.println("\nThird weather update:");
        weatherData.setMeasurements(22.0f, 90.0f, 1008.0f);

        weatherData.removeObserver(forecastDisplay);

        System.out.println("\nFourth weather update:");
        weatherData.setMeasurements(24.0f, 75.0f, 1010.0f);
    }
}

