public class wave {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };

        int i = 0, j = 1, temp = 0;

        while (j < arr.length) {

            if (arr[i] < arr[j]) {

                temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;

            }

            i++;

            j++;

            if (j < arr.length) {

                if (arr[i] > arr[j]) {

                    temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;

                }

                i++;

                j++;

            }

        }

        for (i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }

}
