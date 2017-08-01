class test26 {
    public static void main(String[] args) {
        /*The 'do-while' loop always executes its body at least once, because its conditional expression is at the bottom of the loop.
        * It is an exit-controlled loop.
        * The 'do-while' loop is especially useful for processing menu selections.*/
        int i = 1;         //Initialization expression.
        System.out.println("VALUE OF \'i\': " + i);
        System.out.println("THIS PRINTS THE VALUES OF \'i\' WHICH ARE LESS THAN \'5\'.");
        do {
            System.out.println("\t\t\'i\' IS " + i + ".");
            /*This statement will run at least once, even when the condition is 'false'.*/
            i++;            //Update expression.
        } while( i < 5);
        int j = 10;
        System.out.println("VALUE OF \'j\': " + j);
        System.out.println("THIS PRINTS THE VALUES OF \'j\' WHICH ARE LESS THAN \'5\'.");
        do {
            System.out.println("\t\t\'j\' IS " + j + ".");
            /*This statement will run at least once, even when the condition is 'false'.*/
            j++;            //Update expression.
        } while( j < 5);
    }
}
