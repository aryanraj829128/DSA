package Recursion;

public class coinexchange {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amt=11;

        int ans= coinChange(coins, amt);
        System.out.println(ans);

    }

    public static int coinChange(int[] coins, int amount) {
        int ans = minCoins(coins, amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    private static int minCoins(int[] coins, int amount) {
        // base cases
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;

        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            int ans = minCoins(coins, amount - coins[i]);

            if (ans != Integer.MAX_VALUE) {
                minimum = Math.min(minimum, ans + 1);
            }
        }

        return minimum;
    }
}
