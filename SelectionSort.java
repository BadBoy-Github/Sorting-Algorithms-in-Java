public class SelectionSort {

    public int[] selectionSorter(int[] arr) {
        int temp, count = 0, swap = 0;
        for (int j = 0; j < arr.length-1; j++) {
            int min = j;
            for (int i = j+1; i < arr.length; i++) {
                count++;
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }
            swap++;
            temp = arr[j];
            arr[j] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Number of swaps: " + swap);
        System.out.println("Number of iterations: " + count);

        return arr;
    }

}
