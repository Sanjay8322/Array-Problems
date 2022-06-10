public class Program4 {
    static class Pair{
        int min ;
        int max;
    }
    static Pair getMinMax(int arr[],int n){
        Pair minMax = new Pair();
        if(n==1){
            minMax.max=arr[0];
            minMax.min=arr[0];
        }
        if(arr[0]>arr[1]){
            minMax.max=arr[0];
            minMax.min=arr[1];
        }
        else if(arr[1]>arr[0]){
            minMax.max= arr[1];
            minMax.min=arr[0];
        }
        for(int i = 2 ; i<n;i++){
            if(arr[i]>minMax.max){
                minMax.max=arr[i];
            }else if (arr[i]<minMax.min){
                minMax.min = arr[i];
            }
        }
        return minMax;
    }

    public static void main(String[] args) {
        int a[]={1000, 11, 445, 1, 330, 3000};
        int n = a.length;
        Pair minMax = getMinMax(a,n);
        System.out.println("min is "+ minMax.min);
        System.out.println("max is "+ minMax.max);
    }
}
