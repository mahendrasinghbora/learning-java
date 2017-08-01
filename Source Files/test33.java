class test33 {
    public static void main(String[] args) {
        /*Java supports three jump statements: 'break', 'continue', and 'return'.
        * These statements transfer control to another part of a program.*/
        /*In Java, the 'break' statement has three uses.
        * First, it terminates a statement sequence in a 'switch' statement.
        * Second, it can be used to exit a loop.
        * Third, it can be used as a “civilized” form of 'goto'.
        * When a 'break' statement is encountered inside a loop, the loop is terminated and program control resumes at the next statement following the loop.
        * When used inside a set of nested loops, the 'break' statement will only break out of the innermost loop.*/
        int i;
        System.out.println("GOAL: TO PRINT VALUES FROM \'1\' TO \'10\'");
        for(i=1; i<=10; i++) {
            System.out.println("\t\t\'i\' IS " + i + ".");
        }
        System.out.println("GOAL COMPLETED.");
        System.out.println("\nGOAL: TO PRINT VALUES FROM \'1\' TO \'10\'");
        for(i=1; i<=10; i++) {
            if(i == 6) {
                System.out.println("\t\t\'break\' ENCOUNTERED.");
                break;
            }
            System.out.println("\t\t\'i\' IS " + i + ".");
        }
        System.out.println("GOAL COMPLETED.");
    }
}
