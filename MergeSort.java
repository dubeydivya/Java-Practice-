public class MergeSort {

    //conqure function
    public static void conquer(int arr[], int si, int mid, int ei){
        int merge[] = new int[ei -si + 1];

        int idx1 =si;
        int idx2 =mid+1;
        int x=0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1]<= arr[idx2]){

                merge[x++]=arr[idx1++];
            } else {
                merge[x++]= arr[idx2++];

            }
        }
        while (idx1 <= mid){
            merge[x++] = arr[idx1++];
        }

        while (idx2 <= ei){
            merge[x++]= arr[idx2++];

        }
        //original arr ke andar marge ke element ko copy krna he
        for (int i=0, j=si; i<merge.length; i++, j++){
            arr [j] =merge[i];
        }

    }
    // divide function
    public static void divide(int arr[], int s1, int e1){
        if(s1 >= e1) {
            return;
        }

        //formula of find mid index
        int mid = s1 + (e1 - s1) / 2;
        divide(arr, s1, mid);
        divide(arr, mid+1, e1);

        //conqure
        conquer(arr,s1, mid, e1);


    }
    public static void main(String args[]){
        int arr[] = { 6, 3, 9, 5, 2, 8};
        int n = arr.length;

        //call divide
        divide(arr, 0, n-1);
        //print
        for (int i=0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
}
