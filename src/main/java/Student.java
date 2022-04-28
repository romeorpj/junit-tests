import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

   Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
       return id;
    }

    // returns the student's name
    public String getName(){
       return name;
    }
    // returns the list of grades
    public ArrayList<Integer> getGrades(){
       return grades;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
//        grades.add(100);
//        grades.add(80);
//        grades.add(95);
    }
    // returns the average of the students grades
    public double getGradeAverage() {
       double addy = 0.0;
//       double avg = 0.0;
        for (int grade : grades) {
            addy +=grade;
        }
        return addy / grades.size();
    }

    
}
