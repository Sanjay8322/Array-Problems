public class Program5 {
    static class Pair {
        int max;
        int min;
    }

    static Pair getMinMax(int arr[], int low, int high) {
        Pair minmax= new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        if(low==high){
            minmax.min=arr[low];
            minmax.max=arr[low];
            return minmax;
        }
        if(high==low+1){
            if(arr[low]>arr[high]){
                minmax.max=arr[low];
                minmax.max=arr[high];
            }
            else {
                minmax.max=arr[high];
                minmax.min=arr[low];
            }
            return minmax;
        }
        int mid = (high+low)/2;
        mml = getMinMax(arr,low,mid);
        mmr=getMinMax(arr,mid+1,high);

        if(mml.min< mmr.min){
            minmax.min= mml.min;
        }else {
            minmax.min=mmr.min;
        }
        if(mml.max> mml.max){
            minmax.max= mml.max;
        }else {
            minmax.max= mmr.max;
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int n = arr.length;
        Pair minmax = getMinMax(arr,0,n-1);
        System.out.println("MIN is "+minmax.min);
        System.out.println("MAX is "+minmax.max);
    }
}
