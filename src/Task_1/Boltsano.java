package Task_1;


import java.util.List;

public class Boltsano {
    public static double getMiddle(List<Double> interval) {
        double x_k;
        double e = Math.pow(10, -2);

        double a = interval.get(0);
        double b = interval.get(1);

        x_k = (a + b)/2;
        while (Math.abs(derivativeFunction(x_k)) > e) {
            if (derivativeFunction(x_k) < 0) {
                a = x_k;
            } else {
                b = x_k;
            }
            x_k = (a + b)/2;
        }


        return x_k;
    }

    public static double derivativeFunction(double x) {
        return 4 * x - 16/Math.pow(x, 2);
    }
}
