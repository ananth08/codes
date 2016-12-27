import java.util.Scanner;

/**
 * Created by ananthrkn on 12/24/16.
 */
public class hashsumoftwo {
    public hashsumoftwo(){
        //constructor
    }
    public void operation(int a[], int sum){
        boolean map[] = new boolean[100];

        for(int i =0; i < a.length; i++){
            int temp = sum - a[i];

            if(temp >=0 && map[temp]){
                System.out.println("The elements are: "+a[i]+" "+temp);
            }

            map[a[i]] = true;
        }
    }

    public static void main(String[] args){

        int a[] = new int [5];
        a[0] = 5;
        a[1] = 6;
        a[2] = 7;
        a[3] = 8;
        a[4] = 9;

        System.out.println("Enter the sum to search for: ");
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();

        hashsumoftwo ab = new hashsumoftwo();
        ab.operation(a, sum);
    }
}
