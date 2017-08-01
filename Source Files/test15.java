class test15 {
    public static void main(String[] args) {
        /*An array is a group of like-typed variables that are referred to by a common name.
        * Arrays of any type can be created and may have one or more dimensions.
        * A specific element in an array is accessed by its index.
        * The general form of a one-dimensional array declaration is,
        * type var-name[]; or type[] var-name;
        * The elements in the array allocated by 'new' will automatically be initialized to zero (for numeric types).
        * 'false' (for 'boolean'), or 'null' (for reference types).*/
        int[] marks = new int[5];           //int marks[] = new int[5];
        marks[0] = 80;
        marks[1] = 86;
        marks[2] = 91;
        marks[3] = 93;
        marks[4] = 94;
        double totalMarks = 0;
        System.out.println("VALUE OF THE ELEMENTS OF THE \'marks\' ARRAY");
        for(int i=0; i<5; i++) {
            System.out.println("\t\tmarks[" + i + "]: " + marks[i]);
            totalMarks = totalMarks + marks[i];
        }
        System.out.println("AVERAGE MARKS: " + (totalMarks/5));
        char grade[] = {'C', 'B', 'A', 'A', 'A'};           //Array of characters.
        /*Arrays can be initialized when they are declared.
        * An array initializer is a list of comma-separated expressions surrounded by curly braces.*/
        System.out.println("VALUE OF THE ELEMENTS OF THE \'grade\' ARRAY");
        for(int i=0; i<5; i++) {
            System.out.println("\t\tgrade[" + i + "]: " + grade[i]);
        }
    }
}
