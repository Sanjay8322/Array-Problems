import java.util.Arrays;

public class Program44 {
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i+=2){
            if(i>0&&arr[i-1]>arr[i])
                swap(arr,i-1,i);
            if(i<n-1&& arr[i]<arr[i+1])
                swap(arr,i,i+1);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        sort(arr);
    }
}
