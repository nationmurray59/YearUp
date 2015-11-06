
public class SchoolTeacher implements TaxPayer {

	private double m_income = -1;
	private boolean m_donePayingTaxes = false;
	
	SchoolTeacher(double income)
	{
		SetIncome(income);
	}

	
	public double GetIncome()
	{
		return m_income;
	}
	
	private void SetIncome(double income)
	{
		m_income = income;
	}
	
	public void PayTaxes(double taxRate) 
	{
	 	if (m_donePayingTaxes == false)
		{
			double taxAmount = GetIncome * taxRate;
			double discountedTaxAmount = taxAmount - taxAmount * .1;
			System.out.println("SchoolTeacher is paying the following as tax: " + taxAmount);
			SetIncome(GetIncome - discountedTaxAmount);
			System.out.println("My income after paying taxes is: " + GetIncome());
			m_donePayingTaxes = true;
			
		}
		
	}

	@Override
	public void FileTaxReturn() {
		if (m_donePayingTaxes){
System.out.println("SchoolTeacher is filing his tax return");
		}
		}
		
	}

}
