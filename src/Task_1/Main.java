package Task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int x0 = 1;
        double delta = 0.01f;

        List<Double> interval = Sven.getInterval(x0, delta);
        double middle = Boltsano.getMiddle(interval);
        List<Double> newInterval = new ArrayList<>();
        newInterval.add(0, 0.);
        newInterval.add(1, 10.);
        double min = GoldenSection.getMin(newInterval);
        System.out.println(interval);
        System.out.println(middle);
        System.out.println(min);
    }
}
