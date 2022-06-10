public class Program10 {
    static int findFrequency(int [] A , int x){
        int count =0;
        for(int i =0;i< A.length;i++){
            if(A[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] A = { 1,2,3,4,5,2,6,1,2};
        int x = 2;
        System.out.println(findFrequency(A,x));
    }
}
