package part4AdvancedBuilder;

public class User {
	// Mandatory fields
	private final String email;
	private final String firstName;
	private final String lastName;

	// Optional fields
	private final String nickname;
	private final Integer age;
	private final Integer amountOfSiblings;

	private User(AdvancedUserBuilder builder) {
		email = builder.email;
		firstName = builder.firstName;
		lastName = builder.lastName;
		nickname = builder.nickname;
		age = builder.age;
		amountOfSiblings = builder.amountOfSiblings;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickname() {
		return nickname;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getAmountOfSiblings() {
		return amountOfSiblings;
	}

	@Override
	public String toString() {
		return "User{" +
				"email='" + email + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", nickname='" + nickname + '\'' +
				", age=" + age +
				", amountOfSiblings=" + amountOfSiblings +
				'}';
	}

	public static Email builder() {
		return new AdvancedUserBuilder();
	}

	public static class AdvancedUserBuilder implements Email, FirstName, LastName, Build {
		private String email;
		private String firstName;
		private String lastName;

		private String nickname;
		private Integer age;
		private Integer amountOfSiblings;

		private AdvancedUserBuilder() {
		}

		@Override
		public AdvancedUserBuilder email(String email) {
			this.email = email;
			return this;
		}

		@Override
		public AdvancedUserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		@Override
		public AdvancedUserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		@Override
		public AdvancedUserBuilder nickname(String nickname) {
			this.nickname = nickname;
			return this;
		}

		@Override
		public AdvancedUserBuilder age(int age) {
			this.age = age;
			return this;
		}

		@Override
		public AdvancedUserBuilder amountOfSiblings(int amountOfSiblings) {
			this.amountOfSiblings = amountOfSiblings;
			return this;
		}

		@Override
		public User build() {
			return new User(this);
		}
	}

	public interface Email {
		FirstName email(String email);
	}

	public interface FirstName {
		LastName firstName(String firstName);
	}

	public interface LastName {
		Build lastName(String lastName);
	}

	public interface Build {
		Build nickname(String nickname);
		Build age(int age);
		Build amountOfSiblings(int amountOfSiblings);
		User build();
	}
}
