package Dodatek;

public class WeightedAverageCalculator {

    public static void main(String[] args) {

        try {
            double grades[] = {3,1,2,5,6,4,3};
            double weights[] = {4,6,8,4,4,10,1};

            double weightedAverage = calculateWeightedAverage(grades, weights);
            System.out.println("Weighted average equals: " + weightedAverage);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static double calculateWeightedAverage(double[] grades, double[] weights) {
        validateInput(grades, weights);

        double sum = 0;
        double weightSum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i] * weights[i];
            weightSum += weights[i];
        }

        return sum / weightSum;
    }

    private static void validateInput(double[] grades, double[] weights) {
        if (grades.length == 0 || weights.length == 0) {
            throw new IllegalArgumentException("Collection length equals 0.");
        }

        if (grades.length != weights.length) {
            throw new IllegalArgumentException("Collections differ in length.");
        }

        for (double grade : grades) {
            if (grade < 1 || grade > 6) {
                throw new IllegalArgumentException("Grade exceeds (1-6) range.");
            }
        }

        for (double weight : weights) {
            if (weight < 1 || weight > 10) {
                throw new IllegalArgumentException("Weight exceeds (1-10) range.");
            }
        }
    }
}