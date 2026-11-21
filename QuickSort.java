public class QuickSort {
    int count = 0, swap = 0;

    public int[] quickSorting(int[] arr) {

        sort(arr, 0, arr.length-1);
        
        System.out.println("Number of swaps: " + swap);
        System.out.println("Number of iterations: " + count);

        return arr;

    }

    public void sort(int[] arr, int low, int high) {

        if(low<high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }

    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<=high; j++) {
            count++;
            if(arr[j]<pivot) {
                i++;
                swap++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
               
            }
        }

        swap++;
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        

        return i+1;
    }


    
}
