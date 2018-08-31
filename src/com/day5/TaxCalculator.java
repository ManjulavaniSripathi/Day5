package com.day5;

public class TaxCalculator {
	

	public static  double calculateTax(String empName,boolean isIndian,double empSal) throws CalculateTaxWithInvalidCountry,CalculateWithInvalidName,CalculateTaxWithIneligible{
		
		double taxAmount;
		if(isIndian == false)
	
		{
			throw new CalculateTaxWithInvalidCountry("The Employee should be Indian to Calculate tax");
		}
		if(empName==null ||empName==" ")
		{
			throw new CalculateWithInvalidName("The Employee name cannot be empty");
		}
		if(empSal<1000)
		{
			throw new CalculateTaxWithIneligible("The Employee need not pay tax");
		}
		
		if(empSal>10000 && isIndian == true)
		{
			taxAmount=empSal*8/100;
			return taxAmount;
		}
		if(empSal<100000 && empSal>50000 && isIndian == true)
		{
			taxAmount=empSal*6/100;
			return taxAmount;
		}
		if(empSal<50000 && empSal<30000 && isIndian == true)
		{
		taxAmount=empSal*5/100;
		return taxAmount;
		}
		if(empSal<30000 && empSal<10000 && isIndian == true)
		{
		taxAmount=empSal*4/100;
		return taxAmount;
		}
		return 0;
		
	}

}