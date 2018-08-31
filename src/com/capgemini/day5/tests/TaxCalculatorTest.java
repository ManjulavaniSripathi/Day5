package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.day5.CalculateTaxWithIneligible;
import com.day5.CalculateTaxWithInvalidCountry;
import com.day5.CalculateWithInvalidName;
import com.day5.TaxCalculator;



class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws CalculateTaxWithInvalidCountry, CalculateWithInvalidName, CalculateTaxWithIneligible {
		assertEquals(16000, TaxCalculator.calculateTax("malyka",true,200000));
		assertEquals(3600, TaxCalculator.calculateTax("poudel",true,60000));
		assertEquals(2000, TaxCalculator.calculateTax("sameera",true,40000));
		assertEquals(800, TaxCalculator.calculateTax("manju",true,20000));
		
	
	}
	@Test
	void testCalculateWithInvalidName() {
		Exception e;
		e=assertThrows(CalculateWithInvalidName.class,()-> TaxCalculator.calculateTax("",true,30000));
		assertEquals("The Employee name cannot be empty",e.getMessage());
		
	}
	@Test
	void testCalculateTaxWithIneligible() {
		Exception e;
		e=assertThrows(CalculateTaxWithIneligible.class,()-> TaxCalculator.calculateTax("Tim",true,960));
		assertEquals("The Employee need not pay tax",e.getMessage());
		
	}
	@Test
	void testCalculateTaxWithInvalidCountry() {
		Exception e;
		e=assertThrows(CalculateTaxWithInvalidCountry.class,()-> TaxCalculator.calculateTax("Ron",false,34000));
		assertEquals("The Employee should be Indian to Calculate tax",e.getMessage());
	}

}
