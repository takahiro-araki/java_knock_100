package java_knock_100;


public class java_16 {

	private String text;

	private java_16() {
		this.text = "no_name";
	}

	private java_16(final Object arg) {
		if (arg instanceof String) {
			this.text = (String) arg;
		} else {
			this.text = "no_String";
		}
	}

	public static void main(String[] args) {
		final java_16 java_15 = new java_16();
		final java_16 java_152 = new java_16("John");
		System.out.println(java_15.text + "：" + java_152.text);
	}

}