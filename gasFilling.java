public class gasFilling {
    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        int startingPoint = 0;
        int surplus = 0;
        int deficit = 0;
        for (int i = 0; i < gas.length; i++) {
            surplus = deficit += gas[i] - cost[i];
            // gas[i] = gas[i] - cost[i];
            // deficit = deficit + gas[i];
            // surplus = surplus + deficit;
            // surplus = deficit;
            if (surplus < 0) {
                surplus = 0;
                startingPoint++;
            }
        }
        System.out.println(startingPoint);

    }
}
