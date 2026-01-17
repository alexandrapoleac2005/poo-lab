package lab13;
import static org.junit.Assert.*;
import org.junit.*;

public class StudentAccountTest {

    private StudentAccount studentAccount;

    @Before
    public void setUp() {
        studentAccount = new StudentAccount("John Doe");
    }

    @Test
    public void initialValues(){
        assertEquals("John Doe",studentAccount.getUsername());
        assertTrue(studentAccount.isActive());
        assertEquals(0, studentAccount.getCredits());
        assertEquals("STANDARD", studentAccount.getStatus());
    }
}
