public class Student {

    String name;
    String surname;
    int age;
    int mark;

    public void printStudentData() {
        System.out.println("The name of the student is " + this.name);
        System.out.println("The surname of the student is " + this.surname);
        System.out.println("The age of the student is " + this.age);
        System.out.println("Student's mark is " + this.mark);
    }

    Student(String name, String surname, int age, int mark)

    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mark = mark;
    }
}


