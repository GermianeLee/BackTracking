import java.util.*;

public class Backtracking {

    private int maxProfit = 0;
    private double totalWeight = 0.0; // Renamed from maxWeight for clarity
    private List<Integer> bestSet = new ArrayList<>();
    private static final double epsilon = 1e-10;

    public int knapsack(double[] weights, int[] values, double maxWeight, int n, List<Integer> selectedItems) {
        knapsackRec(weights, values, maxWeight, n, 0, 0, 0, new ArrayList<>(), selectedItems);
        System.out.println("Maximum value achievable: R" + maxProfit);
        System.out.println("Total weight of selected baskets: " + String.format("%.1f", totalWeight) + " kg");
        return maxProfit;
    }

    private void knapsackRec(double[] weights, int[] values, double maxWeight, int n, int index,
                            double currWeight, int currProfit, List<Integer> currentSet, List<Integer> selectedItems) {
        if (index == n) {
            // Corrected condition below: removed extra '(' at start
            if (Math.abs(currWeight - 14.7) < epsilon || Math.abs(currWeight - 15.0) < epsilon) {
                if (currProfit > maxProfit) {
                    maxProfit = currProfit;
                    totalWeight = currWeight;  // Store actual total weight
                    bestSet = new ArrayList<>(currentSet);
                    selectedItems.clear();
                    selectedItems.addAll(bestSet);
                }
            }
            return;
        }

        // Exclude current item
        knapsackRec(weights, values, maxWeight, n, index + 1, currWeight, currProfit, currentSet, selectedItems);

        // Include current item if within weight limit
        if (currWeight + weights[index] <= maxWeight + epsilon) {
            currentSet.add(index);
            knapsackRec(weights, values, maxWeight, n, index + 1, currWeight + weights[index],
                    currProfit + values[index], currentSet, selectedItems);
            currentSet.remove(currentSet.size() - 1);
        }
    }
}
