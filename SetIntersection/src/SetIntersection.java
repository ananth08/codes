import java.util.*;

/**
 * Created by ananthrkn on 1/2/17.
 */
public class SetIntersection {

    HashSet<Integer> set;
    HashSet<Integer> intersection;

    public SetIntersection(){
        set = new HashSet<>();
        intersection = new HashSet<>();
    }

    public void operation(int[] a, int[] b, int size_1, int size_2){
        for(int i = 0; i < size_1; i++){
            set.add(a[i]);
        }

        for(int i =0; i < size_2; i++){
            if(set.contains(b[i])){
                intersection.add(b[i]);
            }
        }

        System.out.println(intersection);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int size_1 = input.nextInt();
        System.out.println("Enter the size of second array:");
        int size_2 = input.nextInt();
        int[] a = new int[size_1];
        int[] b = new int[size_2];
        System.out.println("Enter elements of first array:");
        for(int i = 0; i < size_1; i++){
            a[i] = input.nextInt();
        }

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < size_2; i++){
            b[i] = input.nextInt();
        }

        SetIntersection s = new SetIntersection();
        s.operation(a, b, size_1, size_2);
    }
}
