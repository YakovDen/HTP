import java.util.concurrent.TimeUnit;
/*
 * ����� -����������. � ������� ���������� ���� ������ �� ��� ���������� ����� TasksQueue,
 * ������� ����� �������� �� �������, ���������� � ���� �������� � ��������� ����� ����������.
 * ����������, � ������������ � ����� �������/��������, �������� �� ����������.
 */
public class ThreadBayer implements Runnable {

	private String name;
	private TasksQueue queue;

	public ThreadBayer(String name, TasksQueue queue) {
		this.name = name;
		this.queue = queue;

	}

	@Override
	public void run() {
		while (true) {
			Task task = queue.getTask();
			process(task);
		}

	}

	private void process(Task task) {

		try {//��������� ������� � ������� ������������ ������ Thread.sleep �� �����,
			//��������� � ������� Task getTask()
			TimeUnit.SECONDS.sleep(task.getDuration());

			System.out.println(String.format("%s ����������� �������� \"%s\" � %d ��������", name,
					task.getDescription(), task.getDuration()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
