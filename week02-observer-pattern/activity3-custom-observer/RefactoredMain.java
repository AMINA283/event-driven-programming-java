public class RefactoredMain {

    public static void main(String[] args) {

        DataModel model = new DataModel();

        DataObserver label = new LabelDisplay();

        DataObserver chart = new BarChartDisplay();

        DataObserver logger = new TextLogger();

        model.addObserver(label);

        model.addObserver(chart);

        model.addObserver(logger);

        model.setValue(10);

        model.setValue(20);

        model.setValue(30);

    }

}
