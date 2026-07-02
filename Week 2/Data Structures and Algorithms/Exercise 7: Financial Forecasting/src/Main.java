public class Main {

    public static void main(String[] args) {

        double presentValue = 10000.0;
        double growthRate = 0.08;   // 8%
        int years = 5;

        double futureValue = FinancialForecast.predictFutureValue(
                presentValue,
                growthRate,
                years
        );

        System.out.println("===== Financial Forecast =====");

        System.out.println("Present Value : ₹" + presentValue);
        System.out.println("Annual Growth Rate : " + (growthRate * 100) + "%");
        System.out.println("Forecast Years : " + years);
        System.out.printf("Predicted Future Value : ₹%.2f%n", futureValue);

    }

}
