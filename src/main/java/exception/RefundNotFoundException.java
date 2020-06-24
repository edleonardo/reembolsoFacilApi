package exception;

public class RefundNotFoundException extends Exception {

	private static final long serialVersionUID = -8070237084182854261L;

	public RefundNotFoundException() {
		super();
	}

	public RefundNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RefundNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public RefundNotFoundException(String message) {
		super(message);
	}

	public RefundNotFoundException(Throwable cause) {
		super(cause);
	}
}
