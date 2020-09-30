package be.abis.ExA1.ut;

import be.abis.ExA1.model.Address;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAddress {
    @Test
    public void belgianZipCodeShouldBeNumeric() {
        // Arrange
        Address b2910 = new Address("Heikantstraat","21A","2910","Essen","België","BE");
        boolean expected_OK;

        // act
        boolean result = b2910.checkBelgianZipCode();
        // assert
        assertTrue(result);
    }

    @Test
    public void belgianZipCodeNotNumericSoThrowExecption() {
        // Arrange
        Address b2910 = new Address("Heikantstraat","21A","12AA","Essen","België","BE");
        boolean expected_NOK = false;

        // act
        boolean result = b2910.checkBelgianZipCode();
        // assert
        assertFalse(result);
    }



}
