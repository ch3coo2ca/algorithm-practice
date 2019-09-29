package programmers.lv1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * [Approach] HashMap 
 *  
 *  1. put participants to map 
 *  - if map contains participant[i] , put value = mapValue +1 
 *  - if the map doesn't have participant[i] , put value = 1 
 *  
 *  2. check participants in map 
 *   - if map contains completion[i], put value = mapValue -1 
 *   - so all the completed participants in map will get value 0 
 *   - and remaining participant will have the value 1 
 *   
 *  3. loop through the map to find an element which has value=1 
 *   
 * @author Angela Lee
 *
 */
public class Q01_MarathonRace {

	public static String marathon(String[] participant, String[] completion) {

		String answer = "";

		HashMap<String, Integer> participantMap = new HashMap<String, Integer>();

		for (String p : participant) {
			if (participantMap.containsKey(p)) {
				participantMap.put(p, participantMap.get(p) + 1);
			} else {
				participantMap.put(p, 1);
			}
		}
		
		for (String c : completion) {
			if (participantMap.containsKey(c)) {
				participantMap.put(c, participantMap.get(c) - 1);
			}
		}

		Set<String> key = participantMap.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			if (participantMap.get(name) == 1) {
				answer = name;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };

		String[] participant2 = { "mislav", "stanko", "mislav", "ana" };
		String[] completion2 = { "stanko", "ana", "mislav" };

		String answer = marathon(participant, completion);
		String answer2 = marathon(participant2, completion2);

		System.out.println("answer =>" + answer);
		System.out.println("answer =>" + answer2);

	}

}
