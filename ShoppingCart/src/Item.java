
public class Item 
{

		String m_name = null;
		double m_price = 0.0;
		int m_quantity = 0;
		// 
	Item(String name, double price){
		m_name = name;
		m_price= price;
	}
		Item(String name, double price, int quantity)
		{	
			String m_name = name;
			double m_price = price;
			int m_quantity = quantity;
			//
		}

		public String getM_name() {
			return m_name;
		}

		public void setM_name(String m_name) {
			this.m_name = m_name;
		}

		public double getM_price() {
			return m_price;
		}

		public void setM_price(double m_price) {
			this.m_price = m_price;
		}

		public int getM_quantity() {
			return m_quantity;
		}

		public void setM_quantity(int m_quantity) {
			this.m_quantity = m_quantity;
		}
	
	
	
}	
