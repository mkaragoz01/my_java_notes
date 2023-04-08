package abstract_demo_project;

public class MySqlDatabaseManager extends BaseDatabaseManager{
	@Override
	public void getData() {
		System.out.println("Veri getirildi : Mysql");
	}
}
