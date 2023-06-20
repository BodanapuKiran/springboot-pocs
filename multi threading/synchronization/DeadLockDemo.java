package multithreading;
class a{
	public void d1(b b) {
		System.out.println("thread1 started execution");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
		}
		b.last();
	}
	public void last() {
		System.out.println("thread2 will execute a's last method");
	}
}
class b{
	public void d2(a a) {
		System.out.println("thread2 started execution");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie) {
		}
		a.last();
	}
	public void last() {
		System.out.println("thread2 will execute a's last method");
	}
}
 class DeadLockDemo extends Thread {
public static void main(String[] args) {
	a a=new a();
	b b=new b();
	public void method1() {
		this.start();
		a.d1(b);
	}
	public void run() {
		b.d2(a);
	}

	DeadlockDemo t=new DeadlockDemo();
	t.method1();
}
 }

