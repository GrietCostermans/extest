package be.abis.ExA1.ut;
import be.abis.ExA1.model.Person;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    @Test
    public void ageOfPersonShouldBe42 () {
        //Assert.fail();
        // Arrange
        int expected_Age = 42;
        Person p42 = new Person (1,"Griet","Costermans", LocalDate.of(1978, 6, 28));
        // Act
        int result = p42.calculateAge();
        // Assert
        assertEquals(expected_Age, result);

    }
}
