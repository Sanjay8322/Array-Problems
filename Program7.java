import java.util.Stack;

public class Program7{
    public static void main(String[] args) {
        String str = "sanjay";
        Character[] ch = new Character[str.length()];
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length();i++){
            s.push(str.charAt(i));
        }
        int i = 0;
        while(!s.isEmpty()){
            ch[i++]= s.pop();
        }
        for(int j=0;j< ch.length;j++)
            System.out.print(ch[j]);

    }
}