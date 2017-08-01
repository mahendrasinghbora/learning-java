class BOX {
    double width;           //Instance variable.
    /*The data, or variables, defined within a 'class' are called 'instance variables'.
    * Variables defined within a 'class' are called 'instance variables' because each instance of the 'class' (that is, each object of the class) contains its own copy of these variables.*/
    double height;
    double depth;
    /*The code is contained within 'methods'.
    * It is the 'methods' that determine how a class’ data can be used.
    * In most classes, the 'instance variables' are acted upon and accessed by the 'methods' defined for that 'class'.*/
    double volume() {           //Method.
        return (width * height * depth);
    }
    void setDimensions(double w, double h, double d) {
        /*A 'parameter' is a variable defined by a 'method' that receives a value when the 'method' is called.
        * An 'argument' is a value that is passed to a 'method' when it is invoked.*/
        width = w;
        height = h;
        depth = d;
    }
}

class test37 {
    public static void main(String[] args) {
        /*The 'class' is at the core of Java.
        * It is the logical construct upon which the entire Java language is built because it defines the shape and nature of an object.
        * The 'class' forms the basis for object-oriented programming in Java.
        * A 'class' defines a new data type. This new type can be used to create objects of that type.
        * It is a template for an object. An object is an instance of a 'class'.
        * A 'class' creates a logical framework that defines the relationship between its members. It is a logical construct.*/
        BOX carton = new BOX();          //Creates an object of 'BOX' called 'carton'.
        carton.width = 20;           //Assigns the 'width' variable of 'carton' the value '20'.
        //The 'dot operator' (.) links the name of the 'object' with the name of an 'instance variable'.
        carton.depth = 30;
        carton.height = 20;
        System.out.println("DIMENSIONS OF THE BOX");
        System.out.println("\tWIDTH: " + carton.width + " UNITS");
        System.out.println("\tHEIGHT: " + carton.height + " UNITS");
        System.out.println("\tDEPTH: " + carton.depth + " UNITS");
        System.out.println("VOLUME OF THE BOX: " + carton.volume() + " CUBIC UNITS");            //Invokes the method 'volume()'.
        /*When an instance variable (or method) is accessed by code that is not part of the 'class' in which that instance variable (or method) is defined, it must be done through an object, by use of the 'dot operator'.
        * However, when an instance variable (or method) is accessed by code that is part of the same 'class' as the instance variable (or method), that variable (or method) can be referred to directly.*/
        BOX trunk;           //Declares a reference to the object of the class 'BOX'.
        trunk = new BOX();           //Allocates a 'BOX' object.
        double w = 10, h = 10, d = 10;
        trunk.setDimensions(w, h, d);         //Invokes the method 'setDimensions()'.
        double surfaceArea = 6 * (Math.pow(trunk.depth, 2));
        System.out.println("\nDIMENSIONS OF THE BOX");
        System.out.println("\tWIDTH: " + trunk.width + " UNITS");
        System.out.println("\tHEIGHT: " + trunk.height + " UNITS");
        System.out.println("\tDEPTH: " + trunk.depth + " UNITS");
        System.out.println("SURFACE AREA OF THE BOX: " + surfaceArea + " SQUARE UNITS");
        BOX b1 = new BOX();
        BOX b2 =  b1;           //Makes a copy of the reference. Now, 'b1' and 'b2' both refer to the same object.
        b1 = null;          //Unhooks 'b1' from the original object ('b2' still points to the original object).
    }
}
