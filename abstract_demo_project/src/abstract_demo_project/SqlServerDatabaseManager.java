package abstract_demo_project;

public class SqlServerDatabaseManager extends BaseDatabaseManager{
	@Override
	public void getData() {
		System.out.println("Veri getirildi : Sql Server");
	}
}
