class rectangle {
    private double length;          //Instance variable.
    private double breadth;
    //Constructor overloading.
    rectangle() {           //Constructor.
        System.out.println("CONSTRUCTING RECTANGLE (USING PRE-SPECIFIED VALUES).");
        length = 10;
        breadth = 10;
    }
    rectangle(double l, double b) {         //Parameterized constructor.
        System.out.println("CONSTRUCTING RECTANGLE (USING PARAMETERS).");
        length = l;
        breadth = b;
    }
    /*A 'constructor' initializes an object immediately upon creation.
    * It has the same name as the 'class' in which it resides and is syntactically similar to a 'method'.
    * Once defined, the 'constructor' is automatically called when the object is created, before the 'new' operator completes.
    * They have no return type, not even 'void'.
    * This is because the implicit return type of a class’ constructor is the 'class' type itself.
    * When no constructor is explicitly defined for a 'class', then Java creates a default constructor for the 'class'.
    * The default constructor automatically initializes all instance variables to their default values, which are 'zero', 'null', and 'false', for numeric types, reference types, and boolean, respectively.
    * A 'constructor' with parameters is called a 'parameterized constructor'.*/
    double area() {         //Method.
        return (length * breadth);
    }
    double perimeter() {
        return 2 * (length + breadth);
    }
}


class test38 {
    public static void main(String[] args) {
        rectangle first = new rectangle();
        System.out.println("\tAREA OF \'first\' RECTANGLE: " + first.area() + " SQUARE UNITS");
        double l = 10, b = 20;
        rectangle second = new rectangle(l, b);
        System.out.println("\tPERIMETER OF \'second\' RECTANGLE: " + second.perimeter() + " UNITS");
    }
}
