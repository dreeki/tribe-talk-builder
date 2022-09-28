package part1NoBuilder;

public class Main {
	public static void main(String[] args) {

		User userOnlyRequiredFields = new User("andreas.dewitte@continuum.be", "Andreas", "De Witte");
		User userWithAge = new User("andreas.dewitte@continuum.be", "Andreas", "De Witte", 28);
		User bugWrongOrder = new User("andreas.dewitte@continuum.be", "De Witte", "Andreas", 28);
		User bugSiblingsAndAgeWrongOrder = new User("andreas.dewitte@continuum.be", "Andreas", "De Witte", 2, 28);
		User bugOptionalParams = new User("andreas.dewitte@continuum.be", "Andreas", "De Witte", "dreeki", 28);

	}
}
