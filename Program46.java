public class Program46 {
    static int max(int x,int y){
        return x>y? x: y;
    }
    static int min(int x,int y){
        return x<y? x:y;
    }
    static int maxIndex(int arr[],int n){
        int lmin[] = new int[n];
        int rmax[] = new int[n];
        int i;
        int j;
        lmin[0]=arr[0];
        for( i=1;i<n;i++){
            lmin[i]=min(arr[i],lmin[i-1]);
        }
        rmax[n-1]=arr[n-1];
        for( j=n-2;j>=0;j--){
            rmax[j]=max(arr[j],rmax[j+1]);
        }
         j=0;
         i=0;
         int maxDiff=-1;
        while (i<n && j<n){
            if(lmin[i]<=rmax[j]) {
                maxDiff = max(maxDiff, j - i);
                j++;
            }else
                i++;

        }
        return maxDiff;
    }

    public static void main(String[] args) {

        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = arr.length;
        System.out.println(maxIndex(arr,n));
    }
}
