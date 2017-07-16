package next.model;

public class Result {

	private boolean status;
	private String message;
	
	public Result(boolean status) {
		// TODO Auto-generated constructor stub
		this(status,"");
	}
	public Result(boolean status, String message) {
		// TODO Auto-generated constructor stub
		this.status = status;
		this.message = message;
	}
	
	public static Result ok() {
		// TODO Auto-generated method stub
		return new Result(true);
	}
	
	public static Result fail(String message) {
		return new Result(false, message);
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "Result [status=" + status + ", message=" + message + "]";
	}
	
	

}
