package be.abis.ExA1.ut;

import be.abis.ExA1.model.Address;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAddress {
    @Test
    public void belgianZipCodeShouldBeNumeric() {
        System.out.println("belgianZipCodeShouldBeNumeric");
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
        System.out.println("belgianZipCodeNotNumericSoThrowExecption");
        // Arrange
        Address b2910 = new Address("Heikantstraat","21A","12AA","Essen","België","BE");
        boolean expected_NOK = false;

        // act
        boolean result = b2910.checkBelgianZipCode();
        // assert
        assertFalse(result);
    }


    @Test
    public void newAddressShouldAppendInFile() {
        System.out.println("newAddressShouldAppendInFile");
        Address b2910 = new Address("Heikantstraat", "21A", "2910", "Essen", "België", "BE");
        b2910.writeAddressToFile();
        Address b2920 = new Address("Heikantstraat", "137", "2920", "Kalmthout", "België", "BE");
        b2920.writeAddressToFile();



    }
    @Ignore("noIdeaYet => not yet testable")
    @Test
    public void noIdeaYet() {
        System.out.println("NoIdeaYet");
    }



}
