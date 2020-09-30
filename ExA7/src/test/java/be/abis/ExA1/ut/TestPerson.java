package be.abis.ExA1.ut;

import be.abis.ExA1.exception.AgeException;
import be.abis.ExA1.model.Person;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestPerson {

    private Person testDummy;

    @Before
    public void setUp() {
        testDummy = new Person (1,"Griet","Costermans", LocalDate.of(1978, 6, 28));
    }


    @Test
    public void ageOfPersonShouldBe42 () {
        int result = testDummy.calculateAge();
        assertThat(result,equalTo(42));

    }

    @Test
    public void toStringSentenceStartsWithPerson () {
        //
        String result = testDummy.toString();
        assertThat(result, startsWith("Person"));

    }

    @Test
    public void checkIfAgeExceptionIsThrown () throws AgeException {
        //
        testDummy.setBirthDay(LocalDate.of(2008, 6, 28))
        int result = testDummy.calculateAge();
        //assertThat(result, startsWith("Person"));

    }










}
