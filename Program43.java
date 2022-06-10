import java.util.HashMap;
import java.util.Map;

public class Program43 {
    static void majority(int arr[]){
        int n=arr.length;
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                int count = m.get(arr[i])+1;
                if(count>n/2){
                    System.out.println("majority element is "+ arr[i]);
                }else
                    m.put(arr[i],count);
            }else {
                m.put(arr[i],1);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{2,2,2,2,5,5,2,3,3};
        majority(a);
    }
}
