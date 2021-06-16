import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input decimal number");
        int decimal = input.nextInt();
        while (decimal > 0){
            stack.push(decimal%2);
            decimal = decimal / 2;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
