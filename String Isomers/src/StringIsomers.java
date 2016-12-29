import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ananthrkn on 12/29/16.
 */
public class StringIsomers {

    HashMap<Character,Character> map;


    public StringIsomers(){
        //constructor for the class
        map = new HashMap<>();
    }

    public boolean operation(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            }

            else {
                if(map.containsValue(c2)){
                    return false;
                }
                map.put(c1, c2);
            }
        }

        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter first string:");
        s1 = input.nextLine();
        System.out.println("Enter second string:");
        s2 = input.nextLine();
        StringIsomers s = new StringIsomers();
        boolean b = s.operation(s1, s2);
        System.out.println(b);
    }
}
