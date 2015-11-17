import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/*
 * Класс, иммитирующий пул заданий/действий для покупателя
 */
public class TasksQueue {

	Random random = new Random();
	//создание и инициализация List в одну строку
	List<String> description = Arrays.asList("Подошел к кассам", "Выбрал кассу с наименьшей очередью",
			"Стал в очередь к кассе\n", "Расплачивается", "Идет домой");

	private List<String> getBayerDescription() {
		return description;
	}

	public synchronized Task getTask() {

		return new Task(getBayerDescription(), random.nextInt(10) + 1);
	}

}
