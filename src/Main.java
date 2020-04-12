import InterviewQuestions.Interview2;

public class Main {

	public static void main(String[] args) {
		String[][] badgeTimes = new String[][]{
			{"Paul", "1355"},
			{"Jennifer", "1910"},
			{"John", "830"},
			{"Paul", "1315"},
			{"John", "1615"},
			{"John", "1640"},
			{"John", "835"},
			{"Paul", "1405"},
			{"John", "855"},
			{"John", "930"},
			{"John", "915"},
			{"John", "730"},
			{"Jennifer", "1335"},
			{"Jennifer", "730"},
			{"John", "1630"},
		};

		System.out.println(Interview2.getPeople(badgeTimes));


	}
}
