class test7 {
    public static void main(String[] args) {
        char ch = 'A';
        char ch1 = '7';
        char ch2 = '$';
        char ch3 = '\'';
        /*Escape sequences are used to print non-graphic characters.
        * An escape sequence is a sequence of two or more characters beginning with a backslash.
        * Non-graphic characters are the characters that cannot be typed directly from the keyboard.*/
        char ch4 = '\104';
        /*Character literal in octal notation (Starting with a backslash) ['\ddd' octal character (ddd)].
        Octal(104) is equivalent to decimal(68), which is further equivalent to unicode character 'D'.*/
        char ch5 = '\u0044';
        /*Character literal in hexadecimal notation (Starting with a backslash).
        * Hexadecimal(44) is equivalent to decimal(68), which is further equivalent to unicode character 'D'.*/
        System.out.println("VALUE OF \'ch\': " + ch);
        System.out.println("VALUE OF \'ch1\': " + ch1);
        System.out.println("VALUE OF \'ch2\': " + ch2);
        System.out.println("VALUE OF \'ch3\': " + ch3);
        System.out.println("VALUE OF \'ch4\': " + ch4);
        System.out.println("VALUE OF \'ch5\': " + ch5);
    }
}
