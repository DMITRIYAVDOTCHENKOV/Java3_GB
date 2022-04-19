package src.ru.avdotchenkov.multithreadingLesson;

public class Test {
	public static void main (String[] args) {
		MultithreadingLesson4_1.Print print = new MultithreadingLesson4_1.Print();
		MultithreadingLesson4_1.MyThread mt = new MultithreadingLesson4_1.MyThread(print);
		Thread th1 = new Thread(mt, "A");
		Thread th2 = new Thread(mt, "B");
		Thread th3 = new Thread(mt, "C");
		th1.start();
		th2.start();
		th3.start();
	}
}



