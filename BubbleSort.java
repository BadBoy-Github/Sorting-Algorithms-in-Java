public class BubbleSort {

    int swap = 0, count = 0;

    public int[] bubbleSorter(int[] arr) {
        int temp;

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                count++;
                if (arr[i] > arr[i + 1]) {
                    swap++;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                
            }
        }

        System.out.println("Number of swaps: " + swap);
        System.out.println("Number of iterations: " + count);
        return arr;
    }

}
