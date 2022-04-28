import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTests {

//    @Before
//    public void setup(){
//        Student student = new Student(1L, "Richard");
//    }
@Test
public void doesStudentHaveId(){
    Student student = new Student(2L, "Richard");
    assertEquals(2,student.getId());
}
    @Test
    public void testIfGradesInitialized(){
        Student student = new Student(1L, "Richard");
        assertNotNull(student.getGrades());
    }
@Test
    public void doesAvgEqualNinetyOnePointSix(){
    Student student = new Student(1L, "Richard");
    student.addGrade(100);
    student.addGrade(80);
    student.addGrade(95);
        assertEquals(91.6,student.getGradeAverage(),0.1);
}
//    @Test
//    public void updateGradeEntry(){
//        Student student = new Student(1L, "Richard");
////        grades.set(0, 40);
//        student.updateGrade(20);
//        student.updateGrade(40);
//        student.updateGrade(60);
//        assertEquals(40.0,student.getGradeAverage(),0.1);
//    }
}