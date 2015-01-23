public class JNIWithC {
	static {
		System.loadLibrary("aclib"); // Load native library at runtime
		// hello.dll (Windows) or libhello.so (Unixes)
	}

	// Declare a native method sayHello() that receives nothing and returns void
	private native void sayHello();

	// Test Driver
	public static void main(String[] args) {
		new JNIWithC().sayHello();  // invoke the native method
	}
}

