package part2RegularBuilder;

public class Main {
	public static void main(String[] args) {
		User user = User.builder()
				.email("andreas.dewitte@continuum.be")
				.firstName("Andreas")
				.lastName("De Witte")
				.nickname("dreeki")
				.age(28)
				.amountOfSiblings(2)
				.build();


		User userRequiredFields = User.builder("andreas.dewitte@continuum.be", "Andreas", "De Witte")
				.nickname("dreeki")
				.age(28)
				.build();

		System.out.println(user);
		System.out.println(userRequiredFields);
	}
}
