
public class Bot {
	public final String strGreeting = "Привет! Я существую для того, чтобы помочь тебе выбрать фильм на вечер. Просто задай вопрос: «Что посмотреть?»";
	private final String strMainQuestion = "Что посмотреть?";
	private final String strHaveYouWatchedTheFilm = "Вы смотрели этот фильм? Да/Нет";
	private final String strYes = "Да";
	private final String strNo = "Нет";
	private final String strFarewell = "Приятного просмотра!";
	private final String strIncorrectCommand = "Неправильная команда";
	
	public Bot() {
		
	}
	
	public String work(String command) {
		if (strMainQuestion.equals(command) || strYes.equals(command)) {
			//вызываем генератор фильма и вопрос смотрели фильм или нет
			return strHaveYouWatchedTheFilm;
		}
		else if (strNo.equals(command))
			return strFarewell;
		else 
			return strIncorrectCommand;
	}

}
