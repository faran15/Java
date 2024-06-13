public class Student1 {
    private String name;
    private int registerNumber;
    private int[] marks = new int[5];
    public Student(String name, int registerNumber, int[] marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
    }
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    public double calculateAverage() {
        int total = calculateTotal();
        return (double) total / marks.length;
    }
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Marks in 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
    }

    public static void main(String[] args) {
        String studentName = "John Doe";
        int registerNumber = 123456;
        int[] subjectMarks = {85, 90, 75, 88, 92}; // Example marks for 5 subjects
        Student student = new Student(studentName, registerNumber, subjectMarks);
        student.displayStudentDetails();
    }
}
