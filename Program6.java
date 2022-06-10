public class Program6 {
    static class Pair{
        int max;
        int min;
    }
    static Pair getMaxMin(int arr[],int n){
        Pair minmax = new Pair();
        int i;
        if(n%2==0){
            if(arr[0]>arr[1]){
                minmax.max=arr[0];
                minmax.min=arr[1];
            }
            else{
                minmax.max=arr[1];
                minmax.min=arr[0];
            }
            i=2;
        }else {
            minmax.min=arr[0];
            minmax.max=arr[0];
            i=1;
        }
        while (i<n-1){
            if(arr[i]>arr[i+1]){
                if(arr[i]> minmax.max){
                    minmax.max=arr[i];
                }
                if(arr[i+1]< minmax.min){
                    minmax.min=arr[i+1];
                }
            }
            else{
                if(arr[i+1]>minmax.max){
                    minmax.max=arr[i+1];
                }
                if(arr[i]< minmax.min){
                    minmax.min=arr[i];
                }
            }
            i+=2;
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[]arr ={1000, 11, 445, 1, 330, 3000};
        int n = arr.length;
        Pair minmax = getMaxMin(arr,n);
        System.out.println("minimum is "+ minmax.min);
        System.out.println("maximum is "+minmax.max);
    }
}
