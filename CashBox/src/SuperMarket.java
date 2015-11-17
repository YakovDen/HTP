import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SuperMarket {

	public static void main(String[] args) {
		TasksQueue queue = new TasksQueue();

		ExecutorService es = Executors.newFixedThreadPool(3);//создаю пул/кассы в нем создается 3 потока/покупатели
		//передаю задачу одному из свободных потоков в пуле, 
		//с отслеживанием статуса выполнения задачи потоком Bayer		
		es.submit(new ThreadBayer("Buyer №1", queue));
		es.submit(new ThreadBayer("Buyer №2", queue));
		es.submit(new ThreadBayer("Buyer №3", queue));
		es.submit(new ThreadBayer("Buyer №4", queue));
		es.submit(new ThreadBayer("Buyer №5", queue));

	}

}
