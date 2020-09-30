package be.abis.ExA1.ut;
import be.abis.ExA1.model.Person;
import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestPerson {

    @Test
    public void ageOfPersonShouldBe42 () {
        Person p42 = new Person (1,"Griet","Costermans", LocalDate.of(1978, 6, 28));
        int result = p42.calculateAge();
        assertThat(result,equalTo(42));

    }
}
