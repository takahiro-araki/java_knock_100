package java_knock_100.jni;


public class Java19 {

	public native int stringFromJNI();
	
	static {
		System.loadLibrary("libJava19");
	}
	
	public static void main(String[] args) {
		System.out.println(new Java19().stringFromJNI());
	}
}