package Ex02;

public class GuGudan {
	public static void main(String[] args) {
		printGuGudan();
	}
	
	public static void printGuGudan() {
		for(int i = 2; i < 10; i++) {
			printDan(i);
		}
	}
	
	public static void printDan(int dan) {
		System.out.printf("%d단\n", dan);
		for(int i = 1; i < 10; i++) {
			System.out.printf("\t");
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
	}
}
