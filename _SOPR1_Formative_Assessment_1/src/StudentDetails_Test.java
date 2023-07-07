import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDetails_Test {

    @Test
    public void testMain_StopConditionEntered() {
        // Entering test data
        String input = "ZZZ\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        StudentDetails main = new StudentDetails();
        main.readFirstRecord();

        // Assertions
        assertAll("Verify stop condition entered",
                () -> assertEquals(0, StudentDetails.totPerc, "Expected totPerc to be 0"),
                () -> assertEquals(0, StudentDetails.totStudents, "Expected totStudents to be 0"),
                () -> assertEquals(0, StudentDetails.average, "Expected average to be 0")
        );

        // Reset System.in
        System.setIn(System.in);
    }

    @Test
    public void testMain_RecordsEntered() {
        // Entering test data
        String input = "John Doe\n123 StudentDetails St\n85.5\nZZZ\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        StudentDetails main = new StudentDetails();
        main.readFirstRecord();

        // Assertions
        assertAll("Verify records entered",
                () -> assertEquals(85.5, StudentDetails.totPerc, "Expected totPerc to be 85.5"),
                () -> assertEquals(1, StudentDetails.totStudents, "Expected totStudents to be 1"),
                () -> assertEquals(85.5, StudentDetails.average, "Expected average to be 85.5")
        );

        // Reset System.in
        System.setIn(System.in);
    }
}
