import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ananthrkn on 1/1/17.
 */
public class ArrayWithSubset0 {
    int a[];
    int size, sum;
    Scanner input;
    HashMap<Integer,Integer> map;
    int count;

    public ArrayWithSubset0(){
        input = new Scanner(System.in);
        size = input.nextInt();
        a = new int[size];
        sum = 0;
        map = new HashMap<>();
        count = 0;
    }
    public void operation(){
        for(int i = 0; i < size; i++){
            a[i] = input.nextInt();
        }

        for(int i = 0; i < size; i++){
            sum += a[i];

            if(a[i] == 0 || sum == 0 || map.get(sum) != null){
                System.out.println("There exists a subarray that has a sum equal to 0");
                count++;
                break;
            }

            else {
                map.put(sum, i);
            }
        }

        if(count <= 0){
            System.out.println("There doesnt exist such a subarray");
        }

    }

    public static void main(String[] args){
        ArrayWithSubset0 a = new ArrayWithSubset0();
        a.operation();
    }
}
