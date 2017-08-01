class test24 {
    public static void main(String[] args) {
        /*The 'switch' statement is Java’s multi-way branch statement.
        * A case constant must be of type 'byte', 'short', 'int', 'char', or an enumeration.
        * It can also be of type 'String'.*/
        char alphabets[] = {'A', 'c', 'v', 'e', 'O', 'N'};
        for(int i=0; i<6; i++) {
            switch(alphabets[i]) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("\'" + alphabets[i] + "\' IS A VOWEL.");
                    break;
                default:
                    System.out.println("\'" + alphabets[i] + "\' IS A CONSONANT.");
            }
        }
    }
}
