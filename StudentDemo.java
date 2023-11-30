class Student {
    // Class variables
    private String name;
    private int age;

    // Constructor with parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating objects of the Student class
        Student student1 = new Student("John Doe", 20);
        Student student2 = new Student("Jane Smith", 22);

        // Calling the displayInfo method for each student
        System.out.println("Information for Student 1:");
        student1.displayInfo();

        System.out.println("\nInformation for Student 2:");
        student2.displayInfo();
    }
}