This Java program is a backtracking-based knapsack solver designed to select an optimal set of gift baskets that maximizes total value while staying within a given weight limit. 
The main program defines a list of baskets, each with a weight, value (price in ZAR), and name, and sets a maximum allowable weight of 15 kg. It then calls the Backtracking class
to determine the best combination of baskets.

The Backtracking class explores all possible combinations of baskets using recursion, systematically including or excluding each basket. At each recursive call, it tracks the 
current total weight and value. When all items have been considered, it checks if the total weight is exactly 14.7 kg or 15.0 kg (allowing for floating-point tolerance) and whether
the total value is higher than any previously found combination. If so, it updates the best solution.

Finally, the program outputs the selected baskets, their combined weight, and the maximum value achievable, demonstrating how backtracking can exhaustively search for an optimal knapsack solution.
