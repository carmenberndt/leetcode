package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/****

 Problem 1:

 badge_entries = [
 ["Martha", "enter"],
 ["Tim", "exit"],
 ["Martha", "exit"],
 ["Martha", "exit"]
 ]

 Write a function that finds anyone who badged into the room without using a badge to exit, and anyone who badged out of the room without using a badge to enter.
 In the end, no one should still be in the room.

 Expected output(in any order)
 []
 ["Martha", "Tim"]

 Problem 2:
 We are working on a security system for a badged-access room in our company's building.

 We want to find employees who badged into our secured room unusually often. We have an unordered list of names and entry times over a single day. Access times are given as numbers up to four digits in length using 24-hour time, such as "800" or "2250".

 Write a function that finds anyone who badged into the room three or more times in a one-hour period, and returns each time that they badged in during that period. (If there are multiple one-hour periods where this was true, just return the first one.)

 badge_times = [
 ["Paul",     1355],
 ["Jennifer", 1910],
 ["John",      830],
 ["Paul",     1315],
 ["John",     1615],
 ["John",     1640],
 ["John",      835],
 ["Paul",     1405],
 ["John",      855],
 ["John",      930],
 ["John",      915],
 ["John",      730],
 ["Jennifer", 1335],
 ["Jennifer",  730],
 ["John",     1630],
 ]


 Expected output (in any order)
 John:  830  835  855  915  930
 Paul: 1315 1355 1405

 n: length of the badge records array


 */


public class Interview2 {

	public static ArrayList<HashSet<String>> getPeople(String[][] badgeRecords) {

		HashMap<String, Boolean> map = new HashMap<>();
		HashSet<String> didNotUseBashToExist = new HashSet<>();
		HashSet<String> didNotUseBashToEnter = new HashSet<>();
		for (String[] badgeRecord : badgeRecords) {
			if (badgeRecord[1].equals("enter")) {
				if (map.containsKey(badgeRecord[0]) && map.get(badgeRecord[0])) {
					didNotUseBashToExist.add(badgeRecord[0]);
				}
				map.put(badgeRecord[0], true);
			} else {
				if (map.containsKey(badgeRecord[0])) {
					if (!map.get(badgeRecord[0])) {
						didNotUseBashToEnter.add(badgeRecord[0]);
					} else {
						map.put(badgeRecord[0], false);
					}
				} else {
					didNotUseBashToEnter.add(badgeRecord[0]);
					map.put(badgeRecord[0], false);
				}
			}
		}
		for (Map.Entry<String, Boolean> entry : map.entrySet()) {
			if (entry.getValue()) {
				didNotUseBashToExist.add(entry.getKey());
			}
		}

		ArrayList<HashSet<String>> result = new ArrayList<>();
		result.add(didNotUseBashToExist);
		result.add(didNotUseBashToEnter);
		return result;
	}
}




