package polymorphismDEMO;

public class main {
//Tüm bu işlemlere override denir;
	public static void main(String[] args) {
		/*EmailLogger logger = new EmailLogger();
		loggerlLog("Log Mesajı");
		
		DatabaseLogger dlog = new DatabaseLogger();
		dlog.log("Log Mesajı");
		
		FileLogger flog = new FileLogger();
		flog.log("Log Mesajı");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
		for (BaseLogger log: loggers) {
			log.log("Log mesajı");*/
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
		}
	}
