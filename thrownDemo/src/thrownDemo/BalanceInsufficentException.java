package thrownDemo;

public class BalanceInsufficentException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Message;
	public BalanceInsufficentException(String message) {
		this.Message = message;
	}	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.Message;
	}
}
