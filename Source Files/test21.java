class test21 {
    public static void main(String[] args) {
        /*In an 'if' statement if a specific 'condition' is true, then the 'true-block' is executed otherwise the 'false-block' is executed, in case there is one.
        * The 'condition' can be any expression that returns a boolean value.*/
        int marks[] = {95, 23, 33};
        for(int i=0; i<3; i++) {
            System.out.println("MARKS: " + marks[i]);
            if(marks[i] >= 33) {
                System.out.println("RESULT: PASS");         //True-block or if block.
            }
            else {
                System.out.println("RESULT: FAIL");         //False-block or else block.
            }
        }
    }
}
