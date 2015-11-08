package thread;

public class NewThread extends Thread {

	NewThread(String name) {
		// создать новый поток исполнени€
		super(name);
		System.out.println("Thread2: " + this);
		start();

	}

	@Override
	public void run() {
		//  точка входа в поток исполнени€
		print10("Thread2", 100);
		System.out.println("Tread2 завершен");
	}

	 static void print10(String name, int sleep) {
		//метод печати чисел порци€ми по 10 от 1 до 100
		try {
			int k = 1;
			for (int i = 1; i <= 10; i++) {
				System.out.print(name + ":");
				for (int j = 1; j <= 10; j++) {
					System.out.print(" " + (k++) + " ");
					Thread.sleep(sleep);
				}
				System.out.println();
			}

		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

	}
	/*synchronized static void print10(String name, int sleep) {
		//упор€доченный(синхронизированный) доступ потоков к данному методу
		//(печать чисел порци€ми по 10 от 1 до 100) - ћонитор
		try {
			int k = 1;
			for (int i = 1; i <= 10; i++) {
				System.out.print(name + ":");
				for (int j = 1; j <= 10; j++) {
					System.out.print(" " + (k++) + " ");
					Thread.sleep(sleep);
				}
				System.out.println();
			}

		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

	}*/

}
