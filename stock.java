//max profit after buying and selling stock
public class stock {
    public static void main(String[] args) {
        // int a[]=new int[]{1,5,3,8,12};
        int a[] = { 1, 5, 3, 8, 12 };
        int profit = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                profit = profit + a[i] - a[i - 1];

            }
        }
        System.out.println("profit " + profit);
    }

}
