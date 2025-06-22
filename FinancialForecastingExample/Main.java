public class Main {
    public static void main(String[] args) {
        double currentValue = 1000.0; // Starting amount
        double growthRate = 0.05;     // 5% annual growth
        int years = 10;

        // Basic recursive prediction
        double futureValue = FinancialForecast.predictFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value (Recursive): " + futureValue);

        // Optimized using memoization
        Double[] memo = new Double[years + 1];
        double optimizedValue = FinancialForecast.predictFutureValueMemo(currentValue, growthRate, years, memo);
        System.out.println("Future Value (Memoized): " + optimizedValue);
    }
}