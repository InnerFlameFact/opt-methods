package Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sven {
    public static List<Double> getInterval(double x0, double delta) {
        double x1, x2, x3;
        List<Double> interval = new ArrayList<>();

        x1 = x0;
        x2 = x1 + delta;

        if (function(x1) < function(x2)) {
            delta = -delta;
        }

        while (true){
            delta *= 2;
            x3 = x2 + delta;

            if (function(x3) > function(x2)) {
                break;
            }

            x1 = x2;
            x2 = x3;
        }

        interval.add(x1);
        interval.add(x3);

        Collections.sort(interval);

        return interval;
    }

    public static double function(double x) {
        return 2 * Math.pow(x, 2) + 16 / x;
    }
}
