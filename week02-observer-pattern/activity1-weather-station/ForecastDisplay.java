
public class ForecastDisplay implements Observer {

    private float lastPressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {

        if (pressure > lastPressure) {
            System.out.println("Forecast: Improving weather!");
        } else if (pressure < lastPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather.");
        } else {
            System.out.println("Forecast: More of the same.");
        }

        lastPressure = pressure;
    }
}

