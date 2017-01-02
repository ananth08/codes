import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ananthrkn on 1/2/17.
 */
public class SetUnion {
    HashSet<Integer> set1;

    public SetUnion(){
        set1 = new HashSet<>();
    }

    public void operation(int[] a, int[] b, int size_1, int size_2){
        for(int i = 0; i < size_1; i++){
            set1.add(a[i]);
        }

        for(int j = 0; j < size_2; j++){
            if(!set1.contains(b[j])){
                set1.add(b[j]);
            }
        }

        System.out.println(set1);
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

        SetUnion s = new SetUnion();
        s.operation(a, b, size_1, size_2);
    }
}

