package question4.insurancecompany;

public class Individual extends Account{

	@Override
	public void addInsurancePolicy() {
			
		System.out.println("Bireysel Müşteri Hesabı!");
		
	}

	@Override
	public int compareTo(Account o) {
	
		return 0;
	}

	
	
}
