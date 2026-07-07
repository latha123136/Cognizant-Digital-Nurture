public class FinancialForecast {

    // Recursive method
    public static double predictFutureValue(double presentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return presentValue;
        }

        // Recursive Case
        return predictFutureValue(
                presentValue,
                growthRate,
                years - 1
        ) * (1 + growthRate);

    }

}