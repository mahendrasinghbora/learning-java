class test23 {
    public static void main(String[] args) {
        int marks[] = {94, 78, 85, 67, 27};
        char grade;
        for(int i=0; i<5; i++) {
            System.out.println("MARKS: " + marks[i]);
            if(marks[i] > 90) {
                grade = 'A';
            }
            else if(marks[i] > 80) {
                grade = 'B';
            }
            else if(marks[i] > 70) {
                grade = 'C';
            }
            else if(marks[i] > 60) {
                grade = 'D';
            }
            else {
                grade = 'E';
            }
            System.out.println("GRADE: " + grade);
        }
    }
}
