public class Program13 {

    public static void Subarray(int arr[],int n, int m){
        int sum = 0;
        for(int i = n ; i<=m;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,7,5};
        int n = 2;
        int m=4;
        Subarray(arr,n,m);
    }
}
