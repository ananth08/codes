import java.io.File;
import java.util.*;

/**
 * Created by ananthrkn on 12/27/16.
 */
public class MaxOccurences {

    Scanner input;
    HashMap<String,Integer> map;
    int max;
    Map.Entry pair;

    public MaxOccurences() {
        //constructor
        try {
            input = new Scanner(new File("/Users/ananthrkn/IdeaProjects/MaxOccurences/src/ananth.txt"));
            map = new HashMap<>();
            max = 0;
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void operation(){

        while (input.hasNext()){
            String content = input.next();
            if(map.containsKey(content)){
                int count = map.get(content);
                map.put(content, count + 1);
            }

            else{
                map.put(content, 1);
            }
        }

        maximum();
    }

    public void maximum() {
        Iterator i = map.entrySet().iterator();
        while (i.hasNext()) {
            pair = (Map.Entry) i.next();
            int count = (int) pair.getValue();
            if (count > max) {
                max = count;
            }
        }

        Iterator j = map.entrySet().iterator();
        while (j.hasNext()) {
            Map.Entry ele = (Map.Entry) j.next();

            if(ele.getValue().equals(max)){
                System.out.println(ele.getKey()+" "+ele.getValue());
            }
        }
    }

    public static void main(String[] args){
        MaxOccurences m = new MaxOccurences();
        m.operation();
    }
}
