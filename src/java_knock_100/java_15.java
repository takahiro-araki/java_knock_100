package java_knock_100;


public class java_15 {

	public String text;

	public java_15() {
		this.text = "no_name";
	}

	public java_15(final Object arg) {
		if (arg instanceof String) {
			this.text = (String) arg;
		} else {
			this.text = "no_String";
		}
	}

	public static void main(String[] args) {
		final java_15 java_15 = new java_15();
		final java_15 java_152 = new java_15("John");
		System.out.println(java_15.text + "：" + java_152.text);
	}

}