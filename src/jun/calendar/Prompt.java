package jun.calendar;

import java.util.Scanner;

public class Prompt {

	
	private final static String PROMPT="cal> ";
	
	public void runPrompt() {
		
		int month = 1;
		int year = 2020;
		String PROMPT = "cal > ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) {
			
			System.out.println("년도를 입력해주세요");
			System.out.print("YEAR > ");
			year = scanner.nextInt();
			System.out.println("달을 입력해주세요");
			System.out.print("MONTH > ");
			
			month = scanner.nextInt();
			
			if(month == 1) {
				break;
			}
			if(month == 12) {
				continue;
			}
		
			cal.printCalendar(year, month);
		}
		
		System.out.println("Bey~ ");
		scanner.close();
	}
	
	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();


	}

}
