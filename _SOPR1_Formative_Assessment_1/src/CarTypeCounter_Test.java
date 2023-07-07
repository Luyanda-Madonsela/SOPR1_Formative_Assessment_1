import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class CarTypeCounter_Test {

    @Test
    public void StopConditionEntered() {
        // Entering test data
        String input = "0\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Instantiation and calling of method
        CarTypeCounter countCars = new CarTypeCounter();
        countCars.readCars();

        // Assertions
        assertAll("Verify that stop condition entered",
                () -> assertEquals(0, countCars.totLuxury, "Expected total Luxury cars to be 0"),
                () -> assertEquals(0, countCars.totCommercial, "Expected total Commercial cars to be 0"),
                () -> assertEquals(0, countCars.totSedan, "Expected total Sedans to be 0")
        );

        // Resetting System.in
        System.setIn(System.in);
    }

    @Test
    public void RecordsEntered() {
        // Entering test data
        String input = "1\n2\n3\n0\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Instantiation and calling of method
        CarTypeCounter countCars = new CarTypeCounter();
        countCars.readCars();

        // Assertions
        assertAll("Verify stop condition entered",
                () -> assertEquals(1, countCars.totLuxury, "Expected total Luxury cars to be 1"),
                () -> assertEquals(1, countCars.totCommercial, "Expected total Commercial cars to be 1"),
                () -> assertEquals(1, countCars.totSedan, "Expected total Sedans to be 1")
        );

        // Resetting System.in
        System.setIn(System.in);
    }
}
