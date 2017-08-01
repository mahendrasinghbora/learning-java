class test35 {
    public static void main(String[] args) {
        /*The 'continue' statement is used to force an early iteration of a loop.
        * In 'while' and 'do-while' loops, a 'continue' statement causes control to be transferred directly to the conditional expression that controls the loop.
        * In a 'for' loop, control goes first to the iteration portion of the 'for' statement and then to the conditional expression.
        * For all three loops, any intermediate code is bypassed.
        * As with the 'break' statement, 'continue' may specify a label to describe which enclosing loop to continue.*/
        for(int k=0; k<10; k++) {
            System.out.print(k + "\t");
            if(k%2 == 0) {
                continue;
            }
            System.out.println();           //This will execute only when 'k' is odd.
        }
        int i, j;
        System.out.println("\nTRIANGULAR MULTIPLICATION TABLE FOR \'1\' THROUGH \'10\'");
        outer: for(i=1; i<=10; i++) {
            for(j=1;j<=10; j++) {
                if(j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print((i * j) + "  ");           //This will execute only when 'i' is greater than or equal to 'j'.
            }
        }
    }
}
