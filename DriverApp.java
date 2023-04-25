import java.util.Scanner;
import java.util.Stack;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Espression");
		String input = sc.next();
		if (checkExpression(input))
			System.out.println("valid Expression");
		else
			System.out.println("Invalid Espression");

	}

	private static boolean checkExpression(String input) {
		Stack<Character> stack = new Stack<>();
		for (char k : input.toCharArray()) {
			if (k == '{' || k == '[' || k == '(') {
				stack.push(k);
				continue;
			}
			if (stack.isEmpty())
				return false;

			char z;
			switch (k) {
			case '}':
				z = stack.pop();
				if (z == '[' || z == '(')
					return false;
				break;
			case ']':
				z = stack.pop();
				if (z == '{' || z == '(')
					return false;
				break;
			case ')':
				z = stack.pop();
				if (z == '{' || z == '[')
					return false;
				break;

			}
		}
		return (stack.isEmpty());

	}

}
