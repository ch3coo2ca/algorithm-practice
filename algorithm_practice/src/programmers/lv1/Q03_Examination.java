package programmers.lv1;

import java.util.Arrays;

public class Q03_Examination {

	public static int[] solution(int[] answers) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] count = new int[3];
		int[] answer = {};

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % 5])
				count[0]++;
			if (answers[i] == b[i % 8])
				count[1]++;
			if (answers[i] == c[i % 10])
				count[2]++;
		}

		if (count[1] == count[0] && count[2] == count[0])
			return answer = new int[] { 1, 2, 3 };
		else if (count[0] == count[1] && count[2] < count[0])
			return answer = new int[] { 1, 2 };
		else if (count[0] == count[2] && count[1] < count[0])
			return answer = new int[] { 1, 3 };
		else if (count[1] == count[2] && count[0] < count[1])
			return answer = new int[] { 2, 3 };
		else {
			int max = count[0];
			int num = 0;
			for (int i = 1; i < 3; i++) {
				if (max < count[i]) {
					max = count[i];
					num = i;
				}
			}

			answer = new int[] { num + 1 };
			return answer;
		}

	}

	public static void main(String[] args) {

		int[] answers = { 1, 2, 3, 4, 5 };
		int[] answers2 = { 1, 3, 2, 4, 2 };

		int[] r = solution(answers);
		int[] r2 = solution(answers2);

		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(r2));
	}

}
