public class thirdLargest {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };

        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            if (arr[i] < arr[min]) {
                min = i;
            }

        }
        arr[max] = arr[min];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        arr[max] = arr[min];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println("Third largest >" + arr[max]);

    }

}
