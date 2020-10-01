package be.abis.ExA1.ut;

import be.abis.ExA1.exception.AgeException;
import be.abis.ExA1.model.Address;
import be.abis.ExA1.model.Company;
import be.abis.ExA1.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestPerson {

    private Person testDummy;
    private static

    @Mock
    Company companyMocked;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
        Company c = new Company("ABIS",a);
        testDummy = new Person (1,"Griet","Costermans", LocalDate.of(1978, 6, 28),c,1000);
    }


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

    @Test(expected= AgeException.class)
    public void checkIfAgeExceptionIsThrown () throws AgeException {
        //
        testDummy.setBirthDay(LocalDate.of(2008, 6, 28));
        testDummy.calculateAge();
    }

    @Test
    public void calculateNetSalaryOfBelgianPersonUsingMockCompany() {
        System.out.println("netsal= "+testDummy.calculateNetSalary());

        when(companyMocked.calculateTaxToPay()).thenReturn(51.0);
        assertEquals(490,testDummy.calculateNetSalary(),0);

    }
}
