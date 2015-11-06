
public class TaxPayers {

	public static void main(String[] args) 
	{
		Banker dimon = new Banker(1000000);
		dimon.PayTaxes(.35);
		
		Scientist nye = new Scientist(120000);
		nye.PayTaxes(.20);
		
		SchoolTeacher wisdom = new SchoolTeacher(60000);
		wisdom.PayTaxes(.15);
		
		dimon.FileTaxReturn();
		nye.FileTaxReturn();
		wisdom.FileTaxReturn();
		
		TaxAudit craig = new TaxAudit();
		craig.Audit(dimon);
		craig.Audit(nye);
	}

}
