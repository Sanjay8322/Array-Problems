import java.util.Arrays;

public class Program47 {
    static void missingAndRepeating(int arr[]){
        int miss=0;
        int repeat=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1)
                break;
            if(arr[i]==arr[i+1]){
                repeat=arr[i];
            }
            else if((arr[i+1]-arr[i])!=1){
                miss=i+1;
            }
        }
        System.out.println(miss);
        System.out.println(repeat);
    }

    public static void main(String[] args) {
        int arr[]={4, 3, 6, 2, 1, 1};
        int n=arr.length;
        missingAndRepeating(arr);
    }
}
