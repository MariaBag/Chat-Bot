
public class Bot {
	public final String strGreeting = "������! � ��������� ��� ����, ����� ������ ���� ������� ����� �� �����. ������ ����� ������: ���� ����������?�";
	private final String strMainQuestion = "��� ����������?";
	private final String strHaveYouWatchedTheFilm = "�� �������� ���� �����? ��/���";
	private final String strYes = "��";
	private final String strNo = "���";
	private final String strFarewell = "��������� ���������!";
	private final String strIncorrectCommand = "������������ �������";
	
	public Bot() {
		
	}
	
	public String work(String command) {
		if (strMainQuestion.equals(command) || strYes.equals(command)) {
			//�������� ��������� ������ � ������ �������� ����� ��� ���
			return strHaveYouWatchedTheFilm;
		}
		else if (strNo.equals(command))
			return strFarewell;
		else 
			return strIncorrectCommand;
	}

}
