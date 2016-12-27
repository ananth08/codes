import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 Created by Ananth Radhakrishnan
 */

public class FilePrint{

    Scanner input;
    HashMap<String, Integer> map = new HashMap<>();

    public FilePrint(){
        try {

            input = new Scanner(new File("/Users/ananthrkn/IdeaProjects/PrintingfromFile/src/ananth.txt"));
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void operation(){
        while(input.hasNext()){

                String word = input.next();

                if (map.containsKey(word)) {
                    int count = map.get(word);
                    map.put(word, count + 1);
                } else {
                    map.put(word, 1);
                }
        }

        System.out.println(map);
    }

    public static void main (String[] args){
        FilePrint fp = new FilePrint();
        fp.operation();
    }
}
