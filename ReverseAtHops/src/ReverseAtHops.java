import java.util.Scanner;

import static java.lang.Math.min;

/**
 * Created by ananthrkn on 12/29/16.
 */
public class ReverseAtHops {

    int a[];
    int k;
    Scanner input;
    int size;

    public ReverseAtHops(){
        //constructor for class

        input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size = input.nextInt();
        a = new int[size];
        k = 0;

    }

    public void operation(){

        System.out.println("Enter the sort hop count:");
        k = input.nextInt();

        for (int j = 0; j < size; j++){
            a[j] = input.nextInt();
        }

        for(int i = 0; i < size; i += k){

            int left = i;
            int right = min(size - 1, i + k - 1);

            if (left < right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left ++;
                right --;
            }
            continue;
        }

        for (int j = 0; j < size; j++){
            System.out.print(a[j]+" ");
        }

    }

    public static void main(String[] args){
        ReverseAtHops r = new ReverseAtHops();
        r.operation();
    }
}
