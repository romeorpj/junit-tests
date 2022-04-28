import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTests {

//    @Before
//    public void setup(){
//        Student student = new Student(1, "Richard");
//    }
    @Test
    public void testIfGradesInitialized(){
        Student student = new Student(1, "Richard");
        assertNotNull(student.getGrades());
    }
@Test
    public void doesAvgEqualNinetyOnePointSix(){
    Student student = new Student(1, "Richard");
    student.addGrade(100);
    student.addGrade(80);
    student.addGrade(95);
        assertEquals(91.6,student.getGradeAverage(),0.1);
}
}