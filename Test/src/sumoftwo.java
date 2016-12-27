import java.util.Scanner;

/**
 * Created by ananthrkn on 12/23/16.
 */
public class sumoftwo {

    int a[];
    int size, i;
    int left, right;

    Scanner input = new Scanner(System.in);

    public sumoftwo(){
        //constructor for the class
    }

    public void operation(){
        System.out.println("Enter the number of elements in the array:");

        size = input.nextInt();
        a = new int[size];
        for(i = 0; i <size; i++){
            a[i] = input.nextInt();
        }

        left = 0;
        right = size - 1;

        quicksort(a, left, right);

        sumoftwo(a, left, right);

    }

    public void quicksort(int a[], int left, int right) {

        int index = partition(a, left, right);
        if (left < index -1) {
            partition(a, left , index-1);
        }
        if(index < right){
            partition(a, index, right);
        }

    }

    int partition(int a[], int left, int right){

        int i = left;
        int j = right;
        int temp;

        int pivot = a[(left + right)/2];

        while(i <= j) {

            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        return i;

    }

    public void sumoftwo(int a[], int left, int right){
        int i = left;
        int j = right;

        System.out.println("Enter the expected weight(total): ");
        int sum = input.nextInt();

        while(i < j){
            if(a[i] + a[j] < sum){
                i++;
            }
            if(a[i] + a[j] > sum){
                j--;
            }

            if(a[i] + a[j] == sum){
                System.out.println(a[i]+"\tand"+"\t"+a[j]);
                break;
            }
        }
    }

    public static void main(String [] args){
        System.out.println("Main program triggered");
        sumoftwo a = new sumoftwo();
        a.operation();
    }

}
