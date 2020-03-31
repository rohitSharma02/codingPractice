package leetcode;
import java.util.Random;
// [-1, 0, 1, 2, -1, -4]
// comparable
// Testing for random generate
// null pointer exceptions

public class A1 {
    static void bubbleSort(int a[]) {

        boolean swapped;
        for (int i = 0; i < a.length - 1; i++) {
            swapped = false;
            swap(a,i);
            swapped = true;
            if(!swapped)
            break;
        }
    }
    private static void print(int a[]){
        for(int i=0; i< a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
    static void swap(int a[], int i){
        int temp;
        for(int j = 0; j < a.length-i-1;j++) {
            if (a[j] > a[j + 1]) {
                temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
    public static void main(String args[]){
        Random rand = new Random();
        int[] a = new int[5];
        for(int i = 0 ; i< a.length; i++){
            a[i] = rand.nextInt(22);
            System.out.print(a[i]+",");
        }

        //int a[] = {12,1,8,6,24,14};
        //int n = a.length;
        bubbleSort(a);
        System.out.println("Sorted Array:");
        print(a);

    }
}