class test16 {
    public static void main(String[] args) {
        //int[] numbers, numbers2, numbers3;
        //Creates three arrays with base type (element type) 'int'.
        /*In Java, multidimensional arrays are actually arrays of arrays.*/
        int array[][] = new int[3][3];          //Array of arrays of 'int' (int[][] array = new int[3][3];).
        int i, j;
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                array[i][j] = (i + j);
            }
        }
        System.out.println("VALUE OF THE ELEMENTS OF THE \'array\' ARRAY");
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                System.out.println("\t\tarray[" + i + "][" + j + "]: " + array[i][j]);
            }
        }
        char[][] alphabets = new char[3][];
        alphabets[0] = new char[1];
        alphabets[1] = new char[2];
        alphabets[2] = new char[3];
        for(i=0; i<3; i++) {
            for(j=0; j<i+1; j++) {
                alphabets[i][j] = (char) (65+i);
            }
        }
        System.out.println("\'alphabets\' IS AN UNEVEN (IRREGULAR) MULTI-DIMENSIONAL ARRAY");
        for(i=0; i<3; i++) {
            System.out.print("\t\t");
            for(j=0; j<i+1; j++) {
                System.out.print(alphabets[i][j] + "  ");
            }
            System.out.println();
        }
        float[][] floatArray = {
                {0+0, 0+1, 0+2},
                {1+0, 1+1, 1+2},
                {2+0, 2+1, 2+2}
        };
        /*One can use expressions as well as literal values inside of array initializer(s).*/
        System.out.println("ELEMENTS OF \'floatArray\' HAS BEEN INITIALIZED WITH THE SUM OF THEIR RESPECTIVE ROW AND COLUMN INDEX");
        for(i=0; i<3; i++) {
            System.out.print("\t\t");
            for(j=0; j<3; j++) {
                System.out.print(floatArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
