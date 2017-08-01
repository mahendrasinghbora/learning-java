class test31 {
    public static void main(String[] args) {
        //The 'for-each' loop has many applications, one of which is searching.
        String names[] = {"ELI", "LUKE", "JUDY", "MEGAN", "PEARL"};
        String key = "ELLEN";         //The name to be searched.
        boolean found = false;
        System.out.println("NAMES IN THE LIST");
        for(String name : names) {
            System.out.print(name + "   ");
        }
        System.out.println("\n\nNAME TO BE SEARCHED FOR: " + key);
        for(String name : names) {
            if(name.equals(key)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("NAME FOUND.");
        }
        else {
            System.out.println("NAME NOT FOUND.");
        }
        key = "ELI";
        found = false;
        System.out.println("\nNAME TO BE SEARCHED FOR: " + key);
        for(String name : names) {
            if(name.equals(key)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("NAME FOUND.");
        }
        else {
            System.out.println("NAME NOT FOUND.");
        }
    }
}
