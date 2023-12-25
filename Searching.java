

public class Searching {
    // binary search function
    public static int binarySearch(int[] a, int key){
        int low=0;
        int high = a.length - 1;
        int mid=0;
        while (low <= high)
        {
            mid = (low+high)/2;
            if(key == a[mid]){
                return mid;
            }
            else if(key < a[mid]){
                high =mid -1;
                low=low;

            }
            else {
                low = mid+1;
                high=high;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] a={3, 5, 6, 8, 12, 15, 16, 19, 21};
        //int key = 13;
        int key = 15;
        System.out.println(binarySearch(a,key));
    }
}
