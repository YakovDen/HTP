import java.util.concurrent.TimeUnit;
/*
 *  ласс -ѕокупатель. ” каждого покупател€ есть ссылка на пул выплн€емых задач TasksQueue,
 * которые будут выдавать по запросу, подставл€€ в него описание и случайное врем€ выполнени€.
 * ѕокупатель, в соответствии с пулом заданий/действий, начинает их выполнение.
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

		try {//иммитирую процесс с помощью приостановки потока Thread.sleep на врем€,
			//указанное в задании Task getTask()
			TimeUnit.SECONDS.sleep(task.getDuration());

			System.out.println(String.format("%s ¬ыполн€емые действи€ \"%s\" в %d секундах", name,
					task.getDescription(), task.getDuration()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
