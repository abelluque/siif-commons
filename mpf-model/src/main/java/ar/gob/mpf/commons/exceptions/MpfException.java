package ar.gob.mpf.commons.exceptions;

/**
 * Comportamiento comun de la jerarquia de errores MPF
 * 
 * @author Abel Luque
 *
 */
public abstract class MpfException extends RuntimeException{

	
	private static final long serialVersionUID = -8795542109669646710L;
	
	private int errorCode;

	private Exception nestedException;
	
	
	/**
	 * @param e
	 */
	public MpfException(Exception e, int code) {
		setNestedException(e);
		setErrorCode(code);
	}

	public MpfException(String string, int code) {
		super(string);
		setErrorCode(code);
	}

	public MpfException(String string, Throwable throwable, int code) {
		super(string, throwable);
		setErrorCode(code);
	}

	/**
	 * @return the nestedException
	 */
	public Exception getNestedException() {
		return nestedException;
	}

	/**
	 * @param nestedException
	 *            the nestedException to set
	 */
	public void setNestedException(Exception nestedException) {
		this.nestedException = nestedException;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		String nestedMessage = "";
		if (getNestedException() != null) {
			nestedMessage = "Descripcion del error: "
					+ getNestedException().getMessage();
		}
		return super.getMessage() + nestedMessage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#printStackTrace()
	 */
	@Override
	public void printStackTrace() {
		if (getNestedException() != null) {
			getNestedException().printStackTrace();
		}
		super.printStackTrace();
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
