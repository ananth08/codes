import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Created by ananthrkn on 12/29/16.
 */
public class ArraySubset {

    int[] a, b;
    int sizeofa, sizeofb;
    Scanner input;
    int count;
    int j;

    public ArraySubset() {
        //constructor for this class
        count = 0;
        input = new Scanner(System.in);
    }

    public void operation(){

        System.out.println("Enter size of first array");
        sizeofa = input.nextInt();
        System.out.println("Enter size of second array");
        sizeofb = input.nextInt();

        int asize = max(sizeofb, sizeofa);
        int bsize = min(sizeofa, sizeofb);

        a = new int[asize];
        b = new int[bsize];

        System.out.println("Enter elements of the larger array");
        for(int i = 0; i < asize; i++){
            a[i] = input.nextInt();
        }

        System.out.println("Enter elements of the smaller array");
        for(int i = 0; i < bsize; i++){
            b[i] = input.nextInt();
        }

        for(int c = 0; c < bsize; c++) {
            for (j = 0; j < asize; j++) {
                if (b[c] == a[j]) {
                    break;
                }
            }
        }

            if (j == asize)
            {
                System.out.println("The array is not a subset");
            }
            else
            {
                System.out.println("The array is a subset");
            }
    }

    public static void main(String[] args){
        ArraySubset a = new ArraySubset();
        a.operation();
    }
}
