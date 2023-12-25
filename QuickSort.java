public class QuickSort {
    //crate patition function
    public static int partition(int[] arr, int low, int high) {
        int pivot =arr[high];
        int i =low-1;

        for(int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

            i++;
            int temp =arr[i];
            arr[i] =pivot;
            arr[high]=temp;
            return i;//pivot index
    }


    // create quick sort function
    public static void quickSort(int arr[], int low, int high){
        //condition apply krke check krege low high se km hona chahiye
        if(low<high){
            int pidx =partition(arr, low, high);//find pivot
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);


        }
    }




    public static void main(String args[]){
        int[] arr = {6, 3, 9, 5, 2, 8};
         int n =arr.length; //arr size
        //main function se hum quick sort ko call krte he

        quickSort(arr , 0, n-1);//int arr[], int low, int high=arr , 0, n-1)
        //print
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
