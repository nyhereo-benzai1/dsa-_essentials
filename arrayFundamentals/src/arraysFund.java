public class arraysFund {
    /*arrays key points
    linear
    random access allowed
    homogenous
    fast search operations

    */
    public static void main(String[] args) {
        // basics -- declaration
        int[] arr = new int[10];
        //declaration and initialization at the same step
        int[] arr2 = {1, 2, 3, 4, 5};

        //acess
        System.out.println(arr2[2]);
        System.out.println(arr2.length);

        //multidimensional arrays
        int[][] arr3 = new int[10][10];
        arr3 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //for each loop for arrays
        for (int[] ele: arr3){
            for(int j : ele){
                System.out.println(j);
            }
        }
    }
}
