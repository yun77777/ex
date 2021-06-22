package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex4 {

	public static int cntZero = 0, cntOne = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = 0;
		List<Integer> cntZeroArr = new ArrayList<Integer>();
		List<Integer> cntOneArr = new ArrayList<Integer>();

		for (int i = 0; i < T; i++) {
			cntZero = 0;
			cntOne = 0;
			n = sc.nextInt();
			fibonacci(n);
			cntZeroArr.add(cntZero);
			cntOneArr.add(cntOne);
		}

		for (int i = 0; i < T; i++) {
			System.out.println(cntZeroArr.get(i) + " " + cntOneArr.get(i));
		}

	}

	public static int fibonacci(int n) {

		if (n == 0) {
			cntZero++;
			return 0;
		} else if (n == 1) {
			cntOne++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
