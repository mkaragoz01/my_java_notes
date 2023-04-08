package abstract_demo_project;

public class CustomerManager {
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
