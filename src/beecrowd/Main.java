package beecrowd;

import java.util.Scanner;

public class Main {

    /*
    Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.
    Input: The input file will contain 2 integer numbers.
    Output: 10 + 9 = 19
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(sum(A, B));
    }


    private static int sum(int A, int B){
        return A + B;
    }

}
