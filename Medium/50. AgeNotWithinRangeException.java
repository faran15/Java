class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }
        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name should contain only alphabets and spaces");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "John Doe", 20, "Computer Science");
            System.out.println("Student 1 created: " + student1.getName() + ", Age: " + student1.getAge());

            Student student2 = new Student(2, "Alice", 22, "Mathematics");
            System.out.println("Student 2 created: " + student2.getName() + ", Age: " + student2.getAge());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error creating student: " + e.getMessage());
        }
    }
}
