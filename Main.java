public class Main {
    public static void main(String[] args) {

        System.out.println("Bubble Sort: ");
        int[] arr1 = { 6, 9, 8, 2, 4, 5 };

        System.out.println("Original Array: ");
        printArray(arr1);

        BubbleSort bs = new BubbleSort();
        int[] result1 = bs.bubbleSorter(arr1);

        System.out.println("\nSorted array: ");
        printArray(result1);
        System.out.println("\n-----------------------------------\n");

        System.out.println("\nSelection Sort: ");
        int[] arr2 = { 6, 9, 8, 2, 4, 5 };

        System.out.println("Original Array: ");
        printArray(arr2);

        SelectionSort ss = new SelectionSort();
        int[] result2 = ss.selectionSorter(arr2);

        System.out.println("\nSorted array: ");
        printArray(result2);

        System.out.println("\n-----------------------------------\n");

        System.out.println("Insertion Sort: ");
        int[] arr3 = { 6, 9, 8, 2, 4, 5 };
        
        System.out.println("Original Array: ");
        printArray(arr3);

        InsertionSort is = new InsertionSort();
        int[] result3 = is.insertionSorting(arr3);

        System.out.println("\nSorted array: ");
        printArray(result3);


        System.out.println("\n-----------------------------------\n");

        System.out.println("Quick Sort: ");
        int[] arr4 = { 6, 9, 8, 2, 4, 5 };
        
        System.out.println("Original Array: ");
        printArray(arr4);

        QuickSort qs = new QuickSort();
        int[] result4 = qs.quickSorting(arr4);

        System.out.println("\nSorted array: ");
        printArray(result4);

        System.out.println("\n-----------------------------------\n");

        System.out.println("Merge Sort: ");
        int[] arr5 = { 6, 9, 8, 2, 4, 5 };
        
        System.out.println("Original Array: ");
        printArray(arr5);

        MergeSort ms = new MergeSort();
        int[] result5 = ms.mergeSorting(arr5);

        System.out.println("\nSorted array: ");
        printArray(result5);

    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]\n");
    }
}