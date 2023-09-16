package quinto_gof.facade;

import subsistem1.crm.CrmService;
import subsistem2.cep.ZipCodeApi;

public class Facade {

	public void migrateCustomer(String name, String zipCode) {
		
		String city = ZipCodeApi.getInstance().cityRecover(zipCode);
		String state = ZipCodeApi.getInstance().stateRecover(zipCode);
 		CrmService.saveCustomer(name, zipCode, city, state);
	}
}
