public class span {
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
        int span = arr[max] - arr[min];
        System.out.println("max " + arr[max]);
        System.out.println("min " + arr[min]);
        System.out.println("span " + span);
    }

}
