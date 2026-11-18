
public class StatisticsDisplay implements Observer {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;

    @Override
    public void update(float temperature, float humidity, float pressure) {

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    public void display() {
        System.out.println("Temperature statistics: Max = "
                + maxTemp + "°C, Min = " + minTemp + "°C");
    }
}

