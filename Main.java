public class Main {
    public static void main(String[] args) {
        Group studentsGroup = new Group(5);


        Group studentGroupUpdated = new Group(studentsGroup);

        studentGroupUpdated.groupName = "Flying eagles";
        studentGroupUpdated.courseNumber = 2 ;
        studentGroupUpdated.specialization = "Computer Science";

        studentGroupUpdated.groupOutput();


    }
}

