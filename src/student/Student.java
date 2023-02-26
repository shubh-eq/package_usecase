package student;

public class Student {
    int []studentsList;

    public Student(int []studentsList){
        this.studentsList = studentsList;
    }

    public int addMarkStudents(){
        int result = Add.addArray(this.studentsList);
        return result;
    }
}
