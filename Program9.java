import java.util.Stack;

public class Program9 {
    static String reverse(String  str ){
        char[] ch = new char[str.length()];
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        int i =0;
        while (!s.isEmpty()){
            ch[i++] = s.pop();
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "sanjay";
        System.out.println(reverse(str));
    }
}