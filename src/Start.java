import java.util.Scanner;


public class Start {

	public static void main(String[] args) {
		Bot bot = new Bot();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(bot.strGreeting);
			while(true) {
				String command = bot.work(scanner.nextLine());
				System.out.println(command);
			}
			
		}
	}

}
