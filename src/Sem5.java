import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Sem5 {
    public static void main(String[] args){
    task3("");
    }
    static boolean task1(String str1 ,String str2){
        Map<Character , Character> map = new HashMap<>();
        if(str1.length() != str2.length()){
            return false;
        }
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c2.length ; i++) {
            if(map.containsKey(c1[i])){
             if(c2[i] != map.get(c1[i])) return false;
            }else{
                map.put(c1[i] , c2[i]);
            }
        }
        return true;
    }
    static boolean task2(String str){
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length ; i++) {
            if(c[i] == '(') stack.push(c[i]);
            if(c[i] == ')'){
               if(stack.isEmpty() || stack.pop() != '('){
                   return false;
               }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
static void task3(String str){

}
}
