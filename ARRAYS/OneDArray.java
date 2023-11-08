package ARRAYS;

/*1D arrays syntax
 * type var-name[];  or  type[] var-name;
 * in this type of declaration , only a reference of array is created
 * 
 * to give memory to array , the syntax is -->
 * 
 * var-name = new type[size];
 * 
 */
public class OneDArray {
    public static void main() {

        // int arr[];
        // arr= new int[20];

        int[] arr = new int[20];

        /*
         * accessing elements of array we use for loop
         */

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}