//Реализовать класс Group, который работает с массивом студентов. Обязательные поля: ссылка на массив студентов, количество человек в группе, название группы,
// специализация группы, номер курса. Обязательные методы: конструктор по умолчанию на 15 студентов (предусмотреть автоматическую генерацию фамилий, имён,
// возрастов и других данных), конструктор с одним параметром типа int (задаётся произвольное количество студентов), конструктор с параметром типа Student[]
// (новая группа формируется на основании уже существующего массива студентов), конструктор с параметром типа Group (создаётся точная копия группы).




public class Group {

    Student [] students;
    String groupName;
    String specialization;
    int courseNumber;

    public void outputSortedStudentsName(){
        int j=0;
        for (char i = 'A'; i < 'Z'; i++)
        {
            for (Student currentStudent : students) {
                if (currentStudent.name.charAt(0) == i) {
                    System.out.println();
                    System.out.print(j++ + 1+") ");
                    System.out.println(currentStudent.name + " " + currentStudent.surname);
                }
            }
        }
    }

    public void groupOutput()
    {
        System.out.println(this.groupName);
        System.out.println(this.specialization);

        this.outputSortedStudentsName();

    }

    public Group(Student[] students) {
        this.students = students;
    }

    Group (Group group){

        this.students = new Student[group.students.length];
        for (int i = 0; i < group.students.length; i++) {
            this.students[i] = group.students[i];
        }

        this.specialization = group.specialization;
        this.courseNumber = group.courseNumber;
        this.groupName = group.groupName;

    }


    private void generateArrayOfStudents(int size)
{
    students = new Student[size];
    for (int i = 0; i < size ; i++) {
        students[i] = new Student(new StudentsNames().getName(), new StudentsNames().getSurname(), (int)(18 + Math.random() * (50 - 18)+1),(int)(30 + Math.random() * (100 - 30)+1) );
    }


}
    Group (int size){
        generateArrayOfStudents(size);
    }


    Group (){
        generateArrayOfStudents(15);
    }

    public void printAllStudentsOfCurrentGroup(){//method a
        for (Student student : students)
            student.printStudentData();
    }

    public double returnAverageAge(){//method b

        double totalAge = 0;

        for (Student student : students)
        totalAge += student.age;
        return totalAge/students.length;
    }

    public double returnAverageMark(){//method c

        double totalMark = 0;

        for (Student student : students)
            totalMark += student.mark;
        return totalMark/students.length;
    }

    public int printStudentsQuantityWithMarkLess60(){// method d
        int countStudents = 0;
        for (Student student : students)
            if (student.mark < 60)
                countStudents++;
                return countStudents;
    }

    public void printStudentsDataWithMarkLess60() {// method e

        for (Student student : students)
            if (student.mark < 60)
                System.out.println("\t"+student.name);
    }

    public void printTheBestAndWorstStudents(){// method f

        int bestStudent = 0, worstStudent = 0;

        for (int i = 1; i < students.length; i++) {
            if (students[i].mark > students[bestStudent].mark)
                bestStudent = i;
            if (students[i].mark < students[worstStudent].mark)
                worstStudent = i;
        }
        System.out.println("The best student is " + students[bestStudent].name + ".");
        System.out.println("The worst student is " + students[worstStudent].name + ".");
    }
}
