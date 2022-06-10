public class Program1 {
    static void peakElement(int []arr , int n){
        if(arr[0]>=arr[1])
            System.out.println(arr[0]+" is peak element");
        if(arr[n-1]>=arr[n-2])
            System.out.println(arr[n-1]+" is peak element");

        for (int i=1;i<n-1;i++)
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
                System.out.println(arr[i]+ " is a peak element");
    }

    public static void main(String[] args) {
        int arr[] = { 0,3,30  };
        int n = arr.length;
        peakElement(arr,n);
    }
}
