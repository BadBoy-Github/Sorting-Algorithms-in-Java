public class InsertionSort {

    public int[] insertionSorting(int[] arr) {

        int temp, count = 0, swap = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                count++;
                if (arr[j + 1] < arr[j]) {
                    swap++;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Number of swaps: " + swap);
        System.out.println("Number of iterations: " + count);

        return arr;

    }
}