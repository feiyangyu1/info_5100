import java.util.ArrayList;
import java.util.HashMap;

public class Publisher {

    private ArrayList<Student> students;
    private HashMap<Integer, String> grades;

    private String name;
    private String className;

    public Publisher(String name, String className){
        students = new ArrayList<>();
        grades = new HashMap<>();
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void notifyGrade(){

        for(Student student : students){
            student.getGrades(this, this.className,grades.get(student.getStudentID()));
        }
    }

    public String getClassName() {
        return className;
    }

    public void addGrades(Integer studentID, String grade){
        grades.put(studentID,grade);
    }

    public void addSubscriber(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    public void removeSubscriber(Student student){
        if(students.contains(student)){
            students.remove(student);
        }
    }

}
