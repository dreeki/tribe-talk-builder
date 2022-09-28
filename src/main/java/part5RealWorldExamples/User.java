package part5RealWorldExamples;

public class User {
	private final String firstName;
	private final String lastName;

	private User(UserBuilder builder) {
		firstName = builder.firstName;
		lastName = builder.lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static FirstName builder() {
		return new UserBuilder();
	}

	public static class UserBuilder implements FirstName, LastName, Build {
		private String firstName;
		private String lastName;

		private UserBuilder() {
		}

		@Override
		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		@Override
		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		@Override
		public User build() {
			return new User(this);
		}
	}

	interface FirstName {
		LastName firstName(String firstName);
	}

	interface LastName {
		Build lastName(String lastName);
	}

	interface Build {
		User build();
	}
}
