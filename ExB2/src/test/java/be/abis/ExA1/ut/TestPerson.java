package be.abis.ExA1.ut;

import be.abis.ExA1.exception.AgeException;
import be.abis.ExA1.model.Person;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestPerson {

    private Person testDummy;

    @BeforeEach
    public void setUp() {
        testDummy = new Person (1,"Griet","Costermans", LocalDate.of(1978, 6, 28));
    }

    @Tag("groupAgeTests")
    @DisplayName("groupAgeTests - Age of person should be 42")
    @Test
    public void ageOfPersonShouldBe42 () throws Exception {
        int result = 0;
        result = testDummy.calculateAge();
        assertThat(result,equalTo(42));
    }

    @Test
    public void toStringSentenceStartsWithPerson () {
        //
        String result = testDummy.toString();
        assertThat(result, startsWith("Person"));
    }

    @Tag("groupAgeTests")
    @DisplayName("groupAgeTests - Person should be > 18 years old")
    @Test
    public void checkIfAgeExceptionIsThrown () throws AgeException {
        //
        testDummy.setBirthDay(LocalDate.of(2008, 6, 28));
        Assertions.assertThrows(AgeException.class, () -> {
                    testDummy.calculateAge(); });
    }
}
