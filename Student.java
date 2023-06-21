class Per {
    String name;
    int age;

    // Constructor to initialize name and age
    public Per(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to speak, prints the name and age
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Per {
    int grade;

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to perform studying action
    public void study() {
        System.out.println("I am studying for my " + grade + " grade.");
    }
}

class Person {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student("Rahul", 22, 23);

        // Call the speak and study methods
        student.speak();
        student.study();
    }
}
