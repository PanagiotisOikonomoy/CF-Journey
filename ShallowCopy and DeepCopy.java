package gr.aueb.cf.Projects;

/**
 * Application with ShallowCopy and DeepCopy that proves that after DeepCopy the array remains as it was and with
 * ShallowCopy the Initial Array changes.
 * @author Panagiotis Oikonomou
 */
public class Project03 {

    public static void main(String[] args) {
        int[][] arr = {{1, 4, 5, 6},{2, 4, 8, 3}};
        int[][] clone;
        int[][] deep;
        System.out.println();
        /**
         * ShallowCopy of Initial Array.
         */
        System.out.print("Initial Array of ShallowCopy: ");
        PrintArr(arr);
        clone = ShallowCopy(arr);
        System.out.print("The Initial Copy of ShallowCopy after update the value of possition(0,0 = 40): ");
        PrintArr(clone);
        System.out.print("Initial Array of ShallowCopy: "); //As we see after the Update of value in position(0,0) the initial array position(0,0) change also.
        PrintArr(arr);
        System.out.println();

        /**
         * DeepCopy of Initial Array.
         */
        System.out.print("Initial Array of DeepCopy: ");
        PrintArr(arr);
        deep = DeepCopy(arr);
        System.out.print("The Initial Copy of DeepCopy after we change the Value of position(0,0 = 50): ");
        PrintArr(deep);
        System.out.print("Initial Array of DeepCopy: ");//As we see the Initial Array does not change.
        PrintArr(arr);


    }

    /**
     * ShallowCopy Method.
     */
    public static int[][] ShallowCopy(int[][] arr) {
        int[][] clone = arr;
        clone[0][0] = 40;
        return clone;
    }

    /**
     * DeepCopy Method.
     */
    public static int[][] DeepCopy(int[][] arr) {
        int[][] deep = new int[arr.length][];
        for(int i = 0; i < arr.length; i++){
            deep[i] =  arr[i].clone();
        }
        deep[0][0] = 50;
        return deep;
    }

    /**
     *Prints the Array
     */
    public static void PrintArr(int arr[][]){
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
    }
}