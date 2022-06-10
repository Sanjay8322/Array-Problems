public class Program23 {
    static int partition(int arr[],int low, int end){
        int pivot = arr[end];
        int i = low-1;
        for(int j=low;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        return i+1;
    }
     void sort(int arr[],int low,int end){
        if(low<end){
            int pi = partition(arr,low,end);
            sort(arr,low,pi-1);
            sort(arr,pi+1,end);
        }
     }
     static void print(int arr []){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
     }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        Program23 obj = new Program23();
        obj.sort(arr,0,n-1);
        print(arr);
    }
}
