
public class Exercise8_9 {
	public static void main(String[] args) {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}

class UnsupportedFunctionException extends RuntimeException {
	final private int ERR_CODE;
	
	UnsupportedFunctionException(String msg, int errorCode) {
		super(msg);
		this.ERR_CODE = errorCode;
	}
	
	public UnsupportedFunctionException(String msg) {
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "["+ERR_CODE+"]"+super.getMessage();
	}
}
