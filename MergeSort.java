public class MergeSort {
    public int[] mergeSorting(int[] arr) {
        divide(arr, 0, arr.length-1);
        return arr;
    }

    public void divide(int[] arr, int left, int right) {
        
        int median = (left+right)/2;
        if(left<right) {
            divide(arr, left, median);
            divide(arr, median+1, right); 
            merge(arr, left, median, right);
        }

    }

    private void merge(int[] arr, int left, int median, int right) {

        int s1 = median-left+1;
        int s2 = right-median;
        int[] larr = new int[s1];
        int[] rarr = new int[s2];

        for(int i = 0; i<s1; i++) {
            larr[i] = arr[left+i];
        }
        for(int i = 0; i<s2; i++) {
            rarr[i] = arr[median+i+1];
        }

        int i = 0, j = 0, k = left;

        while(i<s1 && j<s2) {
            if(larr[i]<rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i<s1) {
            arr[k] = larr[i];
            k++;
            i++;
        }

        while(j<s2) {
            arr[k] = rarr[j];
            k++;
            j++;
        }
        
        
    }

}
