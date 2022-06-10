import java.util.Arrays;
import java.util.HashSet;

public class Program21 {
    static void duplicate(int a[],int n){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        if(h.contains(a)){
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int [] a = {2,3,1,2,3};
        int n = a.length;
        duplicate(a,n);
    }
}
