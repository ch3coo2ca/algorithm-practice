package programmers.lv1;


/**
 * [Approach] 
 *  1. convert all characters in string s to lowercase 
 *  2. count letter p and y 
 *  3. if the number of letter p and y is same return true 
 *  4. if there is no letter p and y in the string , return true 
 *  
 * @author Angela Lee
 *
 */
public class Q02_LetterCount {

	public static boolean countLetter(String s) {
		boolean answer = false;
		int pCnt = 0, yCnt = 0;

		char[] cArr = s.toLowerCase().toCharArray();

		for (int i = 0; i < cArr.length; i++) {

			if (cArr[i] == 'p') {
				pCnt++;
			} else if (cArr[i] == 'y') {
				yCnt++;
			}
		}

		if (pCnt == yCnt || (pCnt == 0 && yCnt == 0))
			answer = true;

		return answer;

	}

	public static void main(String[] args) {

		String s = "pPoooyY";
		String s2 = "Pyy";
		boolean answer = countLetter(s);
		boolean answer2 = countLetter(s2);

		System.out.println(answer);
		System.out.println(answer2);
	}

}
