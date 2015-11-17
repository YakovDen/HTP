import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
/*
 * �����, ������������ ��� �������/�������� ��� ����������
 */
public class TasksQueue {

	Random random = new Random();
	//�������� � ������������� List � ���� ������
	List<String> description = Arrays.asList("������� � ������", "������ ����� � ���������� ��������",
			"���� � ������� � �����\n", "��������������", "���� �����");

	private List<String> getBayerDescription() {
		return description;
	}

	public synchronized Task getTask() {

		return new Task(getBayerDescription(), random.nextInt(10) + 1);
	}

}
