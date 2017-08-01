class test32 {
    public static void main(String[] args) {
        //Like all other programming languages, Java allows loops to be nested. That is, one loop may be inside another.
        int i, j, rows = 26;
        for(i=0; i<rows; i++) {
            for(j=0; j<=i; j++) {
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}
