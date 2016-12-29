import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ananthrkn on 12/29/16.
 */
public class TotalCharCount {

    HashMap<Character, Integer> map;
    Scanner input;
    Iterator i;
    char[] a;

    public TotalCharCount() {
        //constructor for class
        map = new HashMap<>();
        i = map.entrySet().iterator();
        try {
            input = new Scanner(new File("/Users/ananthrkn/IdeaProjects/TotalCharCount/src/ananth.txt"));
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void operation(){
        while(input.hasNext()){
            String content = input.next();
            a = content.toCharArray();

            for(int i = 0; i < a.length; i++) {

                if (map.containsKey(a[i])) {
                    int count = map.get(a[i]);
                    map.put(a[i], count + 1);
                }
                else
                {
                    map.put(a[i], 1);
                }
            }
        }

        maximum();
    }

    public void maximum() {
        int max = 0;
        Iterator i = map.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry pair = (Map.Entry)i.next();
            int count = (int)pair.getValue();
            if(count > max){
                max = count;
            }

            if(pair.getValue().equals(max)){
                System.out.println(pair.getKey());
            }
        }
    }

    public static void main(String[] args){
        TotalCharCount t = new TotalCharCount();
        t.operation();
    }

}
