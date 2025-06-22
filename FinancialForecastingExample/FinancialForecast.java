public class FinancialForecast {
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static double predictFutureValueMemo(double currentValue, double growthRate, int years, Double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != null) return memo[years];
        memo[years] = predictFutureValueMemo(currentValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}