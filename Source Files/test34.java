class test34 {
    public static void main(String[] args) {
        /*Java does not have a 'goto' statement because it provides a way to branch in an arbitrary and unstructured manner.
        * This usually makes goto-ridden code hard to understand and hard to maintain.
        * It also prohibits certain compiler optimizations.
        * There are, however, a few places where the 'goto' is a valuable and legitimate construct for flow control.
        * For example, the 'goto' can be useful while exiting from a deeply nested set of loops.
        * To handle such situations, Java defines an expanded form of the 'break' statement, called the labeled 'break'.
        * One of the most common uses for a labeled 'break' statement is to exit from nested loops.*/
        boolean t = true;
        first: {
            System.out.println("START OF \'first\' BLOCK.");
            second: {
                System.out.println("START OF \'second\' BLOCK.");
                third: {
                    System.out.println("START OF \'third\' BLOCK.");
                    System.out.println("\t\tBEFORE THE \'break\' STATEMENT.");
                    if(t) {
                        System.out.println("\t\t\'break\' ENCOUNTERED.");
                        break second;
                    }
                    System.out.println("END OF \'third\' BLOCK.");          //This won't execute.
                }
                System.out.println("END OF \'second\' BLOCK.");         //This too won't execute.
            }
            System.out.println("END OF \'first\' BLOCK.\n");
            int i, j;
            block: for(i=1; i<=10; i++) {
                System.out.print("PASS" + i + ": ");
                for(j=1; j<=10; j++) {
                    if(i == 4) {
                        System.out.println("\'break\' ENCOUNTERED.");
                        break block;
                    }
                    System.out.print(j + "  ");
                }
                System.out.println();
            }
            System.out.println("\nONLY " + (i - 1) + " PASSES COMPLETED.");
        }
    }
}
