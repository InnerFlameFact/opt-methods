package Task_1;

import java.util.List;

public class GoldenSection {
    public static double getMin(List<Double> interval) {
        double e = Math.pow(10, -2);
        double y, z, a, b;

        a = interval.get(0);
        b = interval.get(1);

        y = a + ((3-Math.pow(5, 0.5))/2) * (b - a);
        z = a + b - y;
        while (Math.abs(a - b) > e) {
            double f_y = function(y);
            double f_z = function(z);

            if (f_y <= f_z) {
                b = z;
                z = y;
                y = a + b - y;
            } else {
                a = y;
                y = z;
                z = a + b - z;
            }
        }

        return (a + b)/2;
    }

    public static double function(double point) {
        return 2 * Math.pow(point, 2) + 16 / point;
    }
}
