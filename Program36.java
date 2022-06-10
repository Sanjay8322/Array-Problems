public class Program36 {
    public static int findMin(int arr[],
                              int low, int high)
    {
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[high])
                high--;

            else if(arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }
        return arr[high];
    }

    public static void main(String[] args) {
        int arr[]={ 5, 6, 7, 1, 2, 3, 4 };
        int n = arr.length;
        System.out.println(findMin(arr,0,n-1));
    }
}
