class test25 {
    public static void main(String[] args) {
        /*Java’s iteration statements are 'for', 'while', and 'do-while'.
        * These statements create loops.
        * A loop repeatedly executes the same set of instructions until a termination condition is met.*/
       /*The 'while' loop is Java’s most fundamental loop statement.
       * It repeats a statement or block while its controlling expression is 'true'.
       * The 'while' loop is an entry-controlled loop.*/
       int number = 13;
       int i = 1;           //Initialization expression (It initializes the loop-variable).
        System.out.println("MULTIPLICATION TABLE OF " + number);
       while(i <= 10) {
           System.out.println("\t\t" + number + " TIMES " + i + " IS " + (number * i) + ".");
           i++;         //Update expression (It updates the value of the loop-variable).
       }
    }
}
