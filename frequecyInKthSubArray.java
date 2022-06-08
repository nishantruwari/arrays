public class frequecyInKthSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 3, 3, 2, 3, 1, 2, 1, 1, 3, 4, 2, 1, 2, 1, 2, 3 };
        int k = 4;
        int w = 3;// windowsize
        int n = 2;
        int count = 0;
        int t = w + k - 1;

        for (int i = k; i < t; i++) {
            if (arr[i] == n) {
                count++;
            }

        }
        System.out.println(count);
    }

}
