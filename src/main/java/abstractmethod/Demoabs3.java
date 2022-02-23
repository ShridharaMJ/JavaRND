package abstractmethod;

public class Demoabs3 extends Demoabs2{

	@Override
	public void createMerchant() {
		// TODO Auto-generated method stub
		System.out.println("Merchants are created by account manager");
	}

	@Override
	public void createMerchantSPS() {
		// TODO Auto-generated method stub
		System.out.println("MerchantSPS are created by account manager");
	}

	@Override
	public void CreateFiledMapping() {
		// TODO Auto-generated method stub
		System.out.println("Field mapping also created and now user can download sample template ");
		
	}

	@Override
	public void uploadItems() {
		// TODO Auto-generated method stub
		System.out.println("Items are uploaded successfully");
		
	}

	public void logOUtFromIRIS(String username) {
		System.out.println(username+" has been logged out from IRIS system");
	}

	@Override
	public void DMC() {
		// TODO Auto-generated method stub
		
	}
	
}
