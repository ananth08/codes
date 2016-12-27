import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ananthrkn on 12/26/16.
 */
public class StringOccurence {

    String name;
    Scanner input;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();


    public StringOccurence(){
      input = new Scanner(System.in);
    }

    public void operation(){
        name = input.nextLine();
        char a[] = name.toCharArray();

        for (int i = 0; i < a.length; i++){

            if(map.containsKey(a[i])){
                int count = map.get(a[i]);
                map.put(a[i], count + 1);
            }

            else {
                map.put(a[i], 1);
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args){
        StringOccurence s = new StringOccurence();
        s.operation();
    }
}
