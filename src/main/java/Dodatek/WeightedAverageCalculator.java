package Dodatek;

public class WeightedAverageCalculator {

    public static void main(String[] args) {

        try {
            double grades[] = {3,1,1,5,6,4};
            double weights[] = {4,6,8,4,4,10};

            double weightedAverage = calculateWeightedAverage(grades, weights);
            System.out.println("Średnia ważona: " + weightedAverage);
        } catch (IllegalArgumentException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }

    private static double[] parseInputToArray(String input) {
        String[] values = input.split(",");
        double[] result = new double[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = Double.parseDouble(values[i]);
        }

        return result;
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
            throw new IllegalArgumentException("Długość kolekcji wynosi 0.");
        }

        if (grades.length != weights.length) {
            throw new IllegalArgumentException("Długość kolekcji różni się między sobą.");
        }

        for (double grade : grades) {
            if (grade < 1 || grade > 6) {
                throw new IllegalArgumentException("Ocena wykracza poza dopuszczalny zakres (1-6).");
            }
        }

        for (double weight : weights) {
            if (weight < 1 || weight > 10) {
                throw new IllegalArgumentException("Waga wykracza poza dopuszczalny zakres (1-10).");
            }
        }
    }
}