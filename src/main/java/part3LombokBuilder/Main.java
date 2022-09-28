package part3LombokBuilder;


public class Main {
	public static void main(String[] args) {
		// Issue: compiler verplict niet om de mandatory fields in te vullen
		User user = User.builder()
				.email("andreas.dewitte@continuum.be")
				.firstName("Andreas")
				.lastName("De Witte")
				.nickname("dreeki")
				.age(28)
				.build();

		System.out.println(user);
	}
}
