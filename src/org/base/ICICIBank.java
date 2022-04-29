package org.base;
public class ICICIBank extends AxisBank {

	@Override
	public void savings(String percent) {
		System.out.println("ICICI Bank saving percentage is:"+ percent);
		this.deposits("8%", 65575);
	}

	
	@Override
	public void deposits(String percent, int id) {
		System.out.println("ICICI Bank deposits percentage is:"+ percent+"\n"+"ICICI Bank saving id is:"+id);
		
	}
	@Override
	public void fixed() {
		System.out.println("ICICI Bank fixed is: 9%");
		super.fixed();
	}
	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		i.savings("7%");	
	}

	

	
	

}
