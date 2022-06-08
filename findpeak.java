public class findpeak {
    public static void main(String[] args) {
        int arr[] = {};
        int n = arr.length;
        int peakelement = 0;
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i + 1] > arr[i]) {
                    peakelement = arr[i + 1];
                }

            } else if (i == n - 1) {
                if (arr[i - 1] < arr[i]) {
                    peakelement = arr[i];

                }
            } else {
                if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {

                }
            }
        }
    }

}
