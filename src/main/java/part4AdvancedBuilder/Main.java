package part4AdvancedBuilder;


public class Main {
	public static void main(String[] args) {
		User user = User.builder()
				.email("andreas.dewitte@continuum.be")
				.firstName("Andreas")
				.lastName("De Witte")
				.nickname("dreeki")
				.age(28)
				.build();
	}
}
