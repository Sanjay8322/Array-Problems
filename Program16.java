import java.util.HashMap;
import java.util.Map;

public class Program16 {
    static void union(int[]a, int n,int[]b,int m){
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            mp.put(a[i],i);
        }
        for(int i=0;i<m;i++){
            mp.put(b[i],i);
        }
        for(Map.Entry element : mp.entrySet()){
            System.out.println(element.getKey()+" ");
        }


    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };
        union(a,7,b,9);
    }
}
