
public class TaxAudit 
{
	public void Audit(ITaxPayer taxPayer)
	{
		System.out.println("Tax auditor is now auditing " + taxPayer.getClass());
	}
}
