import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTests {
    private Student student;

    @Before
    public void setup(){

        student = new Student(1,"Richard",ArrayList<Integer> grades);
    }
}
