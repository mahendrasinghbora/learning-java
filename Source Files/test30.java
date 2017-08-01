class test30 {
    public static void main(String[] args) {
        /*The enhanced version of the 'for' also works on multidimensional arrays.
        * In general, when using the 'for-each' for to iterate over an array of 'N' dimensions, the objects obtained will be arrays of 'N–1' dimensions.*/
        int array[][] = new int[3][3];
        int i, j;
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                array[i][j] = (i + j);
            }
        }
        int sum = 0;
        System.out.println("ELEMENTS OF THE \'array\' ARRAY");
        for(int arr[] : array) {
            System.out.print("\t\t");
            for(int e : arr) {
                sum += e;
                System.out.print(e + "  ");
            }
            System.out.println();
        }
        System.out.println("SUM OF THE ELEMENTS OF THE \'array\' ARRAY: " + sum);
        char carry[][][] = new char[4][4][4];
        int k;
        for(i=0; i<4; i++) {
            for(j=0 ;j<4; j++) {
                for(k=0; k<4; k++) {
                    carry[i][j][k] = (char) (65 + i + j + k);
                }
            }
        }
        System.out.println("\n\nELEMENTS OF THE \'carry\' ARRAY");
        for(char carr[][] : carry) {
            for(char car[] : carr) {
                System.out.print("\t\t");
                for(char ch : car) {
                    System.out.print(ch + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
