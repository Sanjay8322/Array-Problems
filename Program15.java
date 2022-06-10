import java.util.HashSet;

public class Program15 {
    static void union(int a[] , int n , int b[], int m){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        for(int i=0;i<m;i++){
            h.add(b[i]);
        }
        System.out.println(h.toString());
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,1,2,3,4};
        int[] b= {7,3,8,9,1,4,10};
        int n = a.length;
        int m =b.length;
        union(a,n,b,m);
    }
}
