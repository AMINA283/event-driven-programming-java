
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class LegacyDisplay implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof LegacyWeatherData) {
            LegacyWeatherData weatherData = (LegacyWeatherData) o;

            System.out.println("Legacy Display:");
            System.out.println("Temperature: "
                    + weatherData.getTemperature() + "°C");
            System.out.println("Humidity: "
                    + weatherData.getHumidity() + "%");
            System.out.println("Pressure: "
                    + weatherData.getPressure());
        }
    }
}

