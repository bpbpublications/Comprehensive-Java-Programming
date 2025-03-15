public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
        this.age = age;   // 'this.age' refers to the instance variable, 'age' refers to the parameter
    }
    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
    public static void main(String[] args) {
        Student student = new Student("John", 20);
        student.display(); // Output: Name: John, Age: 20
    }
}
