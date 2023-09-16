package subsistem2.cep;

public class ZipCodeApi {
	
	private static ZipCodeApi instance = new ZipCodeApi();
	
	private ZipCodeApi() {
		super();
	}
	
	public static ZipCodeApi getInstance() {
		return instance;
	}
	
	public String cityRecover(String zipCode) {
		return "Araraquara";
	}
	public String stateRecover(String zipCode) {
		return "SP";
	}

}
