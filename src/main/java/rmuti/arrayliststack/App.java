package rmuti.arrayliststack;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ArrayListStack stack = new ArrayListStack();
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int number = r.nextInt();
			stack.push(number);
		}
		stack.pop(5);
		System.out.println(stack.getData());
	}
}
