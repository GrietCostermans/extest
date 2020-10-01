package be.abis.ExA1.ut;

import be.abis.ExA1.model.Address;
import be.abis.ExA1.model.Company;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCompany {
    @Test
    public void taxForBECompanyShouldBe51() {

        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgi�","BE");
        Company c = new Company("ABIS",a);

        assertEquals(c.calculateTaxToPay(),51,0);


    }


}
