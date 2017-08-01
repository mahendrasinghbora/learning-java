class test29 {
    public static void main(String[] args) {
        /*A 'for-each' style loop is designed to cycle through a collection of objects, such as an array, in strictly sequential fashion, from start to finish.
        * The 'for-each' style of 'for' is also referred to as the 'enhanced for loop'.
        * Its iteration variable is read-only as it relates to the underlying array.
        * An assignment to the iteration variable has no effect on the underlying array.*/
        int numbers[] = {10, 20, 30, 40, 50 ,60, 70, 80}, sum = 0;
        System.out.println("SUM OF THE ELEMENTS OF THE \'numbers\' ARRAY");
        for(int i : numbers) {
           System.out.print(i + " + ");
            sum += i;
        }
        System.out.print("\b\b= " + sum);
        System.out.println("\n\nELEMENTS OF ARRAY \'numbers\' BEFORE CHANGE IN THE ITERATION VARIABLE \'i\'");
        for(int i : numbers) {
            System.out.print(i + "  ");
            i *= 10;         //It has no effect on 'numbers'.
        }
        System.out.println("\nAFTER THE CHANGE");
        for(int i : numbers) {
            System.out.print(i + "  ");
        }
    }
}
