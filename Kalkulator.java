import java.util.Scanner;
public class kalkulator {
	
	public static void main(String[] args) {
        System.out.println("Hello World");
		Scanner obj1 = new Scanner(System.in);
        
		System.out.println("Podaj pierwszÄ… liczbÄ™:");

        int x = obj1.nextInt();
        System.out.println("Podaj drugÄ… liczbe:");
		int y = obj1.nextInt();
		
		
		
        System.out.println("JakÄ… operacje chcesz wykonac" +
                "1+ " +
                "2- " +
                "3* " +
                "4/ " +
                "5% ");
        int op = obj1.nextInt();
        	
		switch (op) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                System.out.println(x / y);
                break;
            case 5:
                System.out.println(x % y);
                break;
        }
	}
}
