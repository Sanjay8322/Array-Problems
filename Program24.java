public class Program24 {
    static void repeatingElements(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        repeatingElements(arr);
    }
}
