class test36 {
    public static void main(String[] args) {
        /*The 'return' statement is used to explicitly return from a method.
        * That is, it causes program control to transfer back to the caller of the method.*/
        boolean t = true;
        System.out.println("BEFORE the \'return\' STATEMENT.");
        if(t) {
            System.out.println("\'return\' ENCOUNTERED.");
            return;         //Return to caller.
        }
        System.out.println("END OF THE \'main()\' FUNCTION.");          //This won't execute.
    }
}
