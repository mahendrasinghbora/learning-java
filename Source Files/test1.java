class test1 {
    public static void main(String args[]) {
        short days = 365;
        int minutes = days * 24 * 60;
        long seconds = minutes * 60;       //When int seconds=minutes*60;, milliSeconds will evaluate to '1471228928' (Garbage value).
        long milliSeconds = seconds * 1000;
        System.out.println("DAYS: " + days);
        System.out.println("MINUTES: " + minutes);
        System.out.println("SECONDS: " + seconds);
        System.out.println("MILLI SECONDS: " + milliSeconds);
    }
}
