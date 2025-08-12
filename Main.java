import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Gift basket data: weights (in kg) and values (in ZAR)
        double[] weights = {1.2, 1.5, 2.0, 1.8, 1.4, 1.7, 1.6, 2.2, 2.5, 1.3};
        int[] values = {280, 420, 530, 460, 350, 395, 375, 620, 480, 310};
        String[] names = {
            "Sweet Tooth Candy",
            "Classic Chocolate Basket",
            "Chocolate & Nut Deluxe",
            "Healthy Nut Basket",
            "Tea & Biscuit Bliss Basket",
            "Coffee & Snack Basket",
            "Dried Fruit & Nut Combo",
            "Luxury Spa & Treat Basket",
            "Breakfast Starter Basket",
            "Kids’ Fun Pack Basket"
        };
        double maxWeight = 15.0;
        int n = weights.length;

        // Create instance of Backtracking class
        Backtracking knapsack = new Backtracking();
        List<Integer> selectedItems = new ArrayList<>();

        // Call the knapsack method
        knapsack.knapsack(weights, values, maxWeight, n, selectedItems);

        // Output the selected baskets
        System.out.println("Selected gift baskets:");
        for (int i : selectedItems) {
            System.out.println("- " + names[i] + " (Weight: " + String.format("%.1f", weights[i]) + " kg, Value: R" + values[i] + ")");
        }
    }
}
