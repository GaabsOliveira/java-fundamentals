package commons;

public class Messages {
	
	private static String insertInt = "Please insert an integer number: ";
	
	private static String insertDouble = "Please insert an double precision number: ";

	private static String scanError = "Please, insert an valid value to proceed. For more information see: ";
	
	private static String insertString = "Please, enter a string: ";
	
	public static String getInsertInt() {
		return insertInt;
	}

	public void setInsertInt(String insertInt) {
		Messages.insertInt = insertInt;
	}

	public static String getInsertDouble() {
		return insertDouble;
	}

	public static void setInsertDouble(String insertDouble) {
		Messages.insertDouble = insertDouble;
	}

	public static String getScanError() {
		return scanError;
	}

	public static void setScanError(String scanError) {
		Messages.scanError = scanError;
	}

	public static String getInsertString() {
		return insertString;
	}

	public static void setInsertString(String insertString) {
		Messages.insertString = insertString;
	}
}
