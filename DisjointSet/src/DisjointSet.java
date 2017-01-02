import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ananthrkn on 1/2/17.
 */
public class DisjointSet {

    HashSet<Integer> set;

    public DisjointSet(){
        set = new HashSet<>();
    }

    public boolean operation(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }

        for(int i = 0; i < b.length; i++){
            if(set.contains(b[i])){
                System.out.println(b[i]+"\t is common");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int size1 = input.nextInt();
        int a[] = new int[size1];
        for(int i = 0; i < size1; i++){
            a[i] = input.nextInt();
        }

        System.out.println("Enter size of second array");
        int size2 = input.nextInt();
        int b[] = new int[size2];
        for(int i = 0; i < size2; i++){
            b[i] = input.nextInt();
        }

        DisjointSet d = new DisjointSet();
        boolean bo = d.operation(a, b);
        System.out.println(bo);

    }
}
